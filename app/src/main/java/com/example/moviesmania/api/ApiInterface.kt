package com.example.moviesmania.api

import com.example.moviesmania.data.TopRatedMoviesList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("movie/top_rated?api_key=" + Constants.API_KEY)
    suspend fun getTopRatedMovies(@Query("page") page: String): Response<TopRatedMoviesList>
}