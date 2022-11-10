package com.example.moviesmania.di

import android.content.Context
import com.example.moviesmania.api.ApiInterface
import com.example.moviesmania.api.Constants
import com.example.moviesmania.commentsRoom.UserCommentsDao
import com.example.moviesmania.commentsRoom.UserCommentsDatabase
import com.example.moviesmania.repositories.UserCommentsRepository
import com.example.moviesmania.repositories.UserCommentsRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun providesUserCommentsDao(@ApplicationContext context: Context): UserCommentsDao {
        return UserCommentsDatabase.getInstance(context).userCommentsDao()
    }


}