package com.example.moviesmania.repositories

import com.example.moviesmania.api.ApiInterface
import com.example.moviesmania.data.TopRatedMovie
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

interface TopRatedMoviesRepository{
    suspend fun getTopRatedMoviesList() : Flow<List<TopRatedMovie>>
}


class TopRatedMoviesRepositoryImpl @Inject constructor(private val apiInterface: ApiInterface) : TopRatedMoviesRepository {
    override suspend fun getTopRatedMoviesList() : Flow<List<TopRatedMovie>>{
        return flow {
            try {
                val response = apiInterface.getTopRatedMovies("1")
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
