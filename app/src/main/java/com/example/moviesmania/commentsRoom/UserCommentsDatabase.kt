package com.example.moviesmania.commentsRoom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserCommentsEntity::class], version = 1, exportSchema = false)
abstract class UserCommentsDatabase : RoomDatabase() {

    abstract fun userCommentsDao(): UserCommentsDao


    companion object {

        @Volatile
        private var INSTANCE: UserCommentsDatabase? = null


        fun getInstance(context: Context): UserCommentsDatabase {

            synchronized(this) {


                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        UserCommentsDatabase::class.java,
                        "user_comments-database"
                    )

                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }

                return instance
            }
        }

    }
}