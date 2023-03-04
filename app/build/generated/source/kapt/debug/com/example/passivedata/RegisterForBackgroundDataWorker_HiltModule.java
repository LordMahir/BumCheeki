package com.example.passivedata;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(SingletonComponent.class)
@OriginatingElement(
    topLevelClass = RegisterForBackgroundDataWorker.class
)
public interface RegisterForBackgroundDataWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.passivedata.RegisterForBackgroundDataWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(
      RegisterForBackgroundDataWorker_AssistedFactory factory);
}
