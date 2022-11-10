package com.example.moviesmania

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesmania.adapters.TopRatedMoviesAdapter
import com.example.moviesmania.data.TopRatedMovie
import com.example.moviesmania.databinding.ActivityMainBinding
import com.example.moviesmania.viewmodel.TopRatedMoviesViewModel
import com.example.moviesmania.viewmodel.UserCommentsViewModel
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val topRatedMoviesViewModel: TopRatedMoviesViewModel by viewModels()
    private val gson = Gson()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val topRatedMoviesAdapter =
            TopRatedMoviesAdapter(topRatedMoviesViewModel.topRatedMoviesList.value ?: listOf()) {
                onTopRatedMovieClick(it)
            }
        initializeTopRatedMoviesAdapter(topRatedMoviesAdapter, binding)
    }

    private fun initializeTopRatedMoviesAdapter(
        topRatedMoviesAdapter: TopRatedMoviesAdapter,
        binding: ActivityMainBinding
    ) {
        binding.rvTopRatedMovies.layoutManager = LinearLayoutManager(this)
        binding.rvTopRatedMovies.adapter = topRatedMoviesAdapter

        topRatedMoviesViewModel.topRatedMoviesList.observe(this) {
            topRatedMoviesAdapter.updateTopRatedMovies(it)
        }
    }

    private fun onTopRatedMovieClick(topRatedMovie: TopRatedMovie) {
        val intent = Intent(this, TopRatedMovieDetails::class.java)
        intent.putExtra("topRatedMovieObj", gson.toJson(topRatedMovie))
        this.startActivity(intent)
    }


}