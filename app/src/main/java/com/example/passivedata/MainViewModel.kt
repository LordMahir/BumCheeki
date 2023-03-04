/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.passivedata

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.database.FirebaseDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Holds most of the interaction logic and UI state for the app.
 */
@HiltViewModel


class MainViewModel @Inject constructor(


    private val repository: PassiveDataRepository,
    private val healthServicesManager: HealthServicesManager
): ViewModel() {

    private val _uiState = MutableStateFlow<UiState>(UiState.Startup)
    val uiState: StateFlow<UiState> = _uiState




    val passiveDataEnabled: Flow<Boolean>
    val latestHeartRate = repository.latestHeartRate
    var sos: Boolean = false
    init {
        // Check that the device has the heart rate capability and progress to the next state
        // accordingly.
        viewModelScope.launch {
            _uiState.value = if (healthServicesManager.hasHeartRateCapability()) {
                UiState.HeartRateAvailable
            } else {
                UiState.HeartRateNotAvailable
            }
        }

        passiveDataEnabled = repository.passiveDataEnabled
            .distinctUntilChanged()
            .onEach { enabled ->
                viewModelScope.launch {
                    if (enabled)
                        healthServicesManager.registerForHeartRateData()
                    else
                        healthServicesManager.unregisterForHeartRateData()
                }
            }
    }

    fun togglePassiveData(enabled: Boolean) {
        viewModelScope.launch {
            repository.setPassiveDataEnabled(enabled)
        }
    }
    //@Override
    fun heartIsDead( latestHeartRate: Integer){
        if (latestHeartRate>140){
            sos = true
        }
        else if (latestHeartRate<60){
            sos = true
        }
    }




// Send the data to the database
//    databaseRef.child("wearableData").push().setValue(dataToSend)

}

fun firebaseMessage(){

    val database = FirebaseDatabase.getInstance()
    val databaseRef = database.reference

    val dataToSend = hashMapOf(
        "sensorValue" to 123.45,
        "timestamp" to System.currentTimeMillis()
    )

    databaseRef.child("wearableData").push().setValue(dataToSend)

}




sealed class UiState {
    object Startup: UiState()
    object HeartRateAvailable: UiState()
    object HeartRateNotAvailable: UiState()
}
