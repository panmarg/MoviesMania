// Generated by Dagger (https://dagger.dev).
package com.example.moviesmania.di;

import android.content.Context;
import com.example.moviesmania.commentsRoom.UserCommentsDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvidesUserCommentsDaoFactory implements Factory<UserCommentsDao> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvidesUserCommentsDaoFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public UserCommentsDao get() {
    return providesUserCommentsDao(contextProvider.get());
  }

  public static DatabaseModule_ProvidesUserCommentsDaoFactory create(
      Provider<Context> contextProvider) {
    return new DatabaseModule_ProvidesUserCommentsDaoFactory(contextProvider);
  }

  public static UserCommentsDao providesUserCommentsDao(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.providesUserCommentsDao(context));
  }
}