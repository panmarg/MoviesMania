package com.example.moviesmania.di

import com.example.moviesmania.repositories.UserCommentsRepository
import com.example.moviesmania.repositories.UserCommentsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun providesUserCommentsRepository(userCommentsRepositoryImpl : UserCommentsRepositoryImpl)  : UserCommentsRepository
}

