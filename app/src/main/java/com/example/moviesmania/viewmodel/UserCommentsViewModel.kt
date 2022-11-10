package com.example.moviesmania.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviesmania.commentsRoom.UserCommentsEntity
import com.example.moviesmania.repositories.UserCommentsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserCommentsViewModel @Inject constructor(private val userCommentsRepository: UserCommentsRepository) :
    ViewModel() {

    private val _userComments = MutableLiveData<List<UserCommentsEntity>>()
    val userComments: LiveData<List<UserCommentsEntity>>
        get() = _userComments

    init {
        getUpdatedComments()
    }

    private fun getUpdatedComments(){
        viewModelScope.launch {
            userCommentsRepository.getUserComments().collect {
                _userComments.postValue(it)
            }
        }
    }

    fun addComment(userCommentsEntity: UserCommentsEntity){
        viewModelScope.launch {
            userCommentsRepository.addComment(userCommentsEntity)
        }
    }


}