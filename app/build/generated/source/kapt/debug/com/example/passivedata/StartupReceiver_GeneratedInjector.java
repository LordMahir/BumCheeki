package com.example.passivedata;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = StartupReceiver.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface StartupReceiver_GeneratedInjector {
  void injectStartupReceiver(StartupReceiver startupReceiver);
}
