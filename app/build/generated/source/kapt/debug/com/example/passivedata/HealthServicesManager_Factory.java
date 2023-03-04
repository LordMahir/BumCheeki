// Generated by Dagger (https://dagger.dev).
package com.example.passivedata;

import androidx.health.services.client.HealthServicesClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HealthServicesManager_Factory implements Factory<HealthServicesManager> {
  private final Provider<HealthServicesClient> healthServicesClientProvider;

  public HealthServicesManager_Factory(
      Provider<HealthServicesClient> healthServicesClientProvider) {
    this.healthServicesClientProvider = healthServicesClientProvider;
  }

  @Override
  public HealthServicesManager get() {
    return newInstance(healthServicesClientProvider.get());
  }

  public static HealthServicesManager_Factory create(
      Provider<HealthServicesClient> healthServicesClientProvider) {
    return new HealthServicesManager_Factory(healthServicesClientProvider);
  }

  public static HealthServicesManager newInstance(HealthServicesClient healthServicesClient) {
    return new HealthServicesManager(healthServicesClient);
  }
}
