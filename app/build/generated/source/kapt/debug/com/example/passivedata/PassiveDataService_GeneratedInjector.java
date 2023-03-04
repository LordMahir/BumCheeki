package com.example.passivedata;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = PassiveDataService.class
)
@GeneratedEntryPoint
@InstallIn(ServiceComponent.class)
public interface PassiveDataService_GeneratedInjector {
  void injectPassiveDataService(PassiveDataService passiveDataService);
}
