package com.example.moviesmania.commentsRoom

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserCommentsDao {

    @Insert
    suspend fun insertComment(userCommentsEntity: UserCommentsEntity)

    @Query("Select * FROM `user_comments-table`")
    fun getAllUserComments(): Flow<List<UserCommentsEntity>>

}