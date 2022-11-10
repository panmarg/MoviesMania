package com.example.moviesmania.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesmania.data.TopRatedMovie
import com.example.moviesmania.repositories.TopRatedMoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class TopRatedMoviesViewModel @Inject constructor(private val topRatedMoviesRepository: TopRatedMoviesRepository
) : ViewModel() {

    private val _topRatedMoviesList = MutableLiveData<List<TopRatedMovie>>()
    val topRatedMoviesList: LiveData<List<TopRatedMovie>>
        get() = _topRatedMoviesList


    init {
        viewModelScope.launch {
                topRatedMoviesRepository.getTopRatedMoviesList().collect {
                    _topRatedMoviesList.postValue(it)
                }
        }

    }
}