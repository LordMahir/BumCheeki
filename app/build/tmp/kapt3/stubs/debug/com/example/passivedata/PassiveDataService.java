package com.example.passivedata;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/passivedata/PassiveDataService;", "Landroidx/health/services/client/PassiveListenerService;", "()V", "repository", "Lcom/example/passivedata/PassiveDataRepository;", "getRepository", "()Lcom/example/passivedata/PassiveDataRepository;", "setRepository", "(Lcom/example/passivedata/PassiveDataRepository;)V", "onNewDataPointsReceived", "", "dataPoints", "Landroidx/health/services/client/data/DataPointContainer;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PassiveDataService extends androidx.health.services.client.PassiveListenerService {
    @javax.inject.Inject()
    public com.example.passivedata.PassiveDataRepository repository;
    
    public PassiveDataService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.passivedata.PassiveDataRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.passivedata.PassiveDataRepository p0) {
    }
    
    @java.lang.Override()
    public void onNewDataPointsReceived(@org.jetbrains.annotations.NotNull()
    androidx.health.services.client.data.DataPointContainer dataPoints) {
    }
}