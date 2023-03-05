package com.example.passivedata;

import java.lang.System;

/**
 * Holds most of the interaction logic and UI state for the app.
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0010R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006 "}, d2 = {"Lcom/example/passivedata/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/passivedata/PassiveDataRepository;", "healthServicesManager", "Lcom/example/passivedata/HealthServicesManager;", "(Lcom/example/passivedata/PassiveDataRepository;Lcom/example/passivedata/HealthServicesManager;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/passivedata/UiState;", "latestHeartRate", "Lkotlinx/coroutines/flow/Flow;", "", "getLatestHeartRate", "()Lkotlinx/coroutines/flow/Flow;", "passiveDataEnabled", "", "getPassiveDataEnabled", "sos", "getSos", "()Z", "setSos", "(Z)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "heartIsDead", "", "", "togglePassiveData", "enabled", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.passivedata.PassiveDataRepository repository = null;
    private final com.example.passivedata.HealthServicesManager healthServicesManager = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.passivedata.UiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.passivedata.UiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> passiveDataEnabled = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Double> latestHeartRate = null;
    private boolean sos = false;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.passivedata.PassiveDataRepository repository, @org.jetbrains.annotations.NotNull()
    com.example.passivedata.HealthServicesManager healthServicesManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.passivedata.UiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getPassiveDataEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Double> getLatestHeartRate() {
        return null;
    }
    
    public final boolean getSos() {
        return false;
    }
    
    public final void setSos(boolean p0) {
    }
    
    public final void togglePassiveData(boolean enabled) {
    }
    
    public final void heartIsDead(int latestHeartRate) {
    }
}