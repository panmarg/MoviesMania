package com.example.moviesmania.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesmania.commentsRoom.UserCommentsEntity
import com.example.moviesmania.databinding.UserCommentBinding

class UserCommentsAdapter(
    private val userCommentsList: List<UserCommentsEntity>
) : RecyclerView.Adapter<UserCommentsAdapter.UserCommentsViewHolder>() {

    private var _userCommentsList: List<UserCommentsEntity> = userCommentsList


    fun updateUserCommentsList(newUserCommentsList: List<UserCommentsEntity>){
        _userCommentsList = newUserCommentsList
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserCommentsViewHolder {
        return UserCommentsViewHolder(
            UserCommentBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: UserCommentsViewHolder, position: Int) {
        holder.bind(_userCommentsList[position])
    }

    override fun getItemCount(): Int {
        return _userCommentsList.size
    }


    inner class UserCommentsViewHolder(val binding: UserCommentBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(userCommentsEntity: UserCommentsEntity) {
            binding.tvUsername.text = userCommentsEntity.username.substring(0, 1).uppercase() + userCommentsEntity.username.substring(1).lowercase();
            binding.tvUserComment.text = userCommentsEntity.comment
            binding.tvUserCommentDate.text = userCommentsEntity.commentDate
        }

    }

}