package com.example.moviesmania.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviesmania.api.Constants
import com.example.moviesmania.data.TopRatedMovie
import com.example.moviesmania.databinding.TopRatedMovieCardBinding

class TopRatedMoviesAdapter(


    private var topRatedMoviesList: List<TopRatedMovie>,
    private var onTopRatedMovieClick: (topRatedMovie: TopRatedMovie) -> Unit
) :
    RecyclerView.Adapter<TopRatedMoviesAdapter.TopRatedMoviesViewHolder>() {


    private var _topRatedMoviesList: List<TopRatedMovie> = topRatedMoviesList

    fun updateTopRatedMovies(newTopRatedMovies: List<TopRatedMovie>) {
        _topRatedMoviesList = newTopRatedMovies
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopRatedMoviesViewHolder {
        return TopRatedMoviesViewHolder(
            TopRatedMovieCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TopRatedMoviesViewHolder, position: Int) {
        holder.bind(_topRatedMoviesList[position])
    }

    override fun getItemCount(): Int {
        return _topRatedMoviesList.size
    }

    inner class TopRatedMoviesViewHolder(val binding: TopRatedMovieCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(topRatedMovie: TopRatedMovie) {
            Glide.with(binding.root.context).load(Constants.IMAGE_URL + topRatedMovie.backdrop_path)
                .into(binding.ivTopRatedMovieImage)
            binding.tvTopRatedMovieTitle.text = topRatedMovie.title
            binding.tvTopRatedMovieLanguage.text =
                "Language: " + topRatedMovie.original_language.uppercase()
            binding.tvTopRatedMovieReleaseDate.text = "Release Date: " + topRatedMovie.release_date
            binding.tvTopRatedMovieRating.text = topRatedMovie.vote_average.toString()
            binding.clTopRatedMovie.setOnClickListener {
                onTopRatedMovieClick(topRatedMovie)

            }

        }


    }

}