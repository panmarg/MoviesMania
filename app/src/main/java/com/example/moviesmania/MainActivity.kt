package com.example.moviesmania

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesmania.adapters.TopRatedMoviesAdapter
import com.example.moviesmania.data.TopRatedMovie
import com.example.moviesmania.databinding.ActivityMainBinding
import com.example.moviesmania.viewmodel.TopRatedMoviesViewModel
import com.google.gson.Gson


class MainActivity : AppCompatActivity() {


    private var topRatedMoviesViewModel = TopRatedMoviesViewModel()
    private val gson = Gson()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val topRatedMoviesAdapter =
            TopRatedMoviesAdapter(topRatedMoviesViewModel.topRatedMoviesList.value ?: listOf()) {
                onTopRatedMovieClick(it)
            }



        binding.rvTopRatedMovies.layoutManager = LinearLayoutManager(this)
        binding.rvTopRatedMovies.adapter = topRatedMoviesAdapter

        topRatedMoviesViewModel.topRatedMoviesList.observe(this) {
            topRatedMoviesAdapter.updateTopRatedMovies(it)
        }


    }

    private fun onTopRatedMovieClick(topRatedMovie: TopRatedMovie) {
        val intent = Intent(this, TopRatedMovieDetails::class.java)
        //Parcalized object
        intent.putExtra("topRatedMovieObj", gson.toJson(topRatedMovie))
        this.startActivity(intent)
    }


}