package com.example.moviesmania

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.example.moviesmania.api.Constants
import com.example.moviesmania.data.TopRatedMovie
import com.example.moviesmania.databinding.ActivityTopRatedMovieDetailsBinding
import com.example.moviesmania.fragments.AddCommentFragment
import com.example.moviesmania.fragments.UserCommentsFragment
import com.example.moviesmania.viewmodel.UserCommentsViewModel
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TopRatedMovieDetails : AppCompatActivity() {
    private val userCommentsViewModel: UserCommentsViewModel by viewModels()
    private val gson = Gson()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityTopRatedMovieDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val commentsFragment = UserCommentsFragment()
        val addCommentFragment = AddCommentFragment()
        val topRatedMovieObj =
            gson.fromJson(intent.getStringExtra("topRatedMovieObj"), TopRatedMovie::class.java)
        binding.clTopRatedMovieDetailsImage.setOnClickListener {
            finish()
        }
        userCommentsViewModel.userComments.observe(this){
            binding.tvTopRatedMovieUserComments.text = "Comments (" + it.size.toString() + ")"
        }


        fragmentToDisplay(commentsFragment)
        movieDetailsToDisplay(binding, topRatedMovieObj)



        binding.tvTopRatedMovieAddComment.setOnClickListener {
            fragmentToDisplay(addCommentFragment)
        }


        binding.tvTopRatedMovieUserComments.setOnClickListener {
            fragmentToDisplay(commentsFragment)
        }




    }

    private fun movieDetailsToDisplay(
        binding: ActivityTopRatedMovieDetailsBinding,
        topRatedMovieObj: TopRatedMovie
    ) {
        Glide.with(this).load(Constants.IMAGE_URL + topRatedMovieObj.backdrop_path)
            .into(binding.ivTopRatedMovieDetailsImage)
        binding.tvTopRatedMovieTitle.text = topRatedMovieObj.title
        binding.tvTopRatedMovieLanguageReleaseDate.text =
            "Language: " + topRatedMovieObj.original_language.uppercase() + " , " + "Release Date: " + topRatedMovieObj.release_date
        binding.tvIMDBRating.text = "IMDB: " + topRatedMovieObj.vote_average
        binding.tvTopRatedMovieStorylineDetails.text = topRatedMovieObj.overview
    }


    private fun fragmentToDisplay(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fcvComments, fragment)
            commit()
        }
    }
}