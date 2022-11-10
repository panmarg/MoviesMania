package com.example.moviesmania.di;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = MovieManiaApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface MovieManiaApp_GeneratedInjector {
  void injectMovieManiaApp(MovieManiaApp movieManiaApp);
}
