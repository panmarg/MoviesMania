package com.example.moviesmania.data

import com.google.gson.annotations.SerializedName

data class TopRatedMoviesList(
    @SerializedName("page")
    var page: Int,
    @SerializedName("results")
    var results: List<TopRatedMovie>,
)
