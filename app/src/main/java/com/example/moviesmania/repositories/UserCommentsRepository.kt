package com.example.moviesmania.repositories

import com.example.moviesmania.commentsRoom.UserCommentsDao
import com.example.moviesmania.commentsRoom.UserCommentsEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

interface UserCommentsRepository {
    suspend fun getUserComments() :Flow<List<UserCommentsEntity>>
    suspend fun addComment(userCommentsEntity: UserCommentsEntity)
}


class UserCommentsRepositoryImpl @Inject constructor(private val userCommentsDao: UserCommentsDao) :  UserCommentsRepository{
    override suspend fun getUserComments() :Flow<List<UserCommentsEntity>> = flow {
        userCommentsDao.getAllUserComments().collect{
            comment -> emit(comment)
        }
    }

    override suspend fun addComment(userCommentsEntity: UserCommentsEntity){
        userCommentsDao.insertComment(userCommentsEntity)
    }
}