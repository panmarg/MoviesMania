package com.example.moviesmania.repositories

import com.example.moviesmania.api.ApiInterface
import com.example.moviesmania.data.TopRatedMovie
import com.example.moviesmania.network.RetrofitClient
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class TopRatedMoviesRepository (
) {
    private val retrofit = RetrofitClient.getInstance()
    private val apiInterface = retrofit.create(ApiInterface::class.java)

    suspend fun getTopRatedMoviesList() : Flow<List<TopRatedMovie>>{
        return flow {
            try {
                val response = apiInterface.getTopRatedMovies("5")
                if (response.isSuccessful) {
                if (response.body()?.results?.size!! <= 0) {
                    println("Response - No Data " + response.body()?.results?.size!!)
                } else {
                    emit(response.body()?.results!!)
                }
            } else {
                println("Response - Error Body " + response.errorBody().toString())
            }
            }catch (Ex: Exception){
           println("Error " + Ex.localizedMessage)
            }
        }
    }
}
