package com.example.moviesmania.data


data class TopRatedMovie (
    var adult: Boolean,
    var backdrop_path: String,
    var id: Int,
    var original_language: String,
    var original_title: String,
    var overview: String,
    var popularity: String,
    var poster_path: String,
    var release_date: String,
    var title: String,
    var vote_average: Double,
    var vote_count: Int,

)
