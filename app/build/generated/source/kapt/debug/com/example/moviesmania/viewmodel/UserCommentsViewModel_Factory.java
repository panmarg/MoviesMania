// Generated by Dagger (https://dagger.dev).
package com.example.moviesmania.viewmodel;

import com.example.moviesmania.repositories.UserCommentsRepository;
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
public final class UserCommentsViewModel_Factory implements Factory<UserCommentsViewModel> {
  private final Provider<UserCommentsRepository> userCommentsRepositoryProvider;

  public UserCommentsViewModel_Factory(
      Provider<UserCommentsRepository> userCommentsRepositoryProvider) {
    this.userCommentsRepositoryProvider = userCommentsRepositoryProvider;
  }

  @Override
  public UserCommentsViewModel get() {
    return newInstance(userCommentsRepositoryProvider.get());
  }

  public static UserCommentsViewModel_Factory create(
      Provider<UserCommentsRepository> userCommentsRepositoryProvider) {
    return new UserCommentsViewModel_Factory(userCommentsRepositoryProvider);
  }

  public static UserCommentsViewModel newInstance(UserCommentsRepository userCommentsRepository) {
    return new UserCommentsViewModel(userCommentsRepository);
  }
}