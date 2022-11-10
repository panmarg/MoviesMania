package com.example.moviesmania.commentsRoom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_comments-table")
data class UserCommentsEntity(
    @PrimaryKey(autoGenerate = true) val userId: Long,
    @ColumnInfo(name = "username")
    val username: String,
    @ColumnInfo(name = "comment")
    val comment: String,

){
    constructor(username: String, comment: String) : this(0,username,comment)
}