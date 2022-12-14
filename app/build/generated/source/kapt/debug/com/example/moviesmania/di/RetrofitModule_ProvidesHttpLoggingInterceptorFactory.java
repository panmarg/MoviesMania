// Generated by Dagger (https://dagger.dev).
package com.example.moviesmania.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvidesHttpLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  @Override
  public HttpLoggingInterceptor get() {
    return providesHttpLoggingInterceptor();
  }

  public static RetrofitModule_ProvidesHttpLoggingInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpLoggingInterceptor providesHttpLoggingInterceptor() {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.providesHttpLoggingInterceptor());
  }

  private static final class InstanceHolder {
    private static final RetrofitModule_ProvidesHttpLoggingInterceptorFactory INSTANCE = new RetrofitModule_ProvidesHttpLoggingInterceptorFactory();
  }
}
