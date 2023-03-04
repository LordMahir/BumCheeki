// Generated by Dagger (https://dagger.dev).
package com.example.passivedata;

import androidx.hilt.work.HiltWorkerFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainApplication_MembersInjector implements MembersInjector<MainApplication> {
  private final Provider<HiltWorkerFactory> workerFactoryProvider;

  public MainApplication_MembersInjector(Provider<HiltWorkerFactory> workerFactoryProvider) {
    this.workerFactoryProvider = workerFactoryProvider;
  }

  public static MembersInjector<MainApplication> create(
      Provider<HiltWorkerFactory> workerFactoryProvider) {
    return new MainApplication_MembersInjector(workerFactoryProvider);
  }

  @Override
  public void injectMembers(MainApplication instance) {
    injectWorkerFactory(instance, workerFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.passivedata.MainApplication.workerFactory")
  public static void injectWorkerFactory(MainApplication instance,
      HiltWorkerFactory workerFactory) {
    instance.workerFactory = workerFactory;
  }
}
