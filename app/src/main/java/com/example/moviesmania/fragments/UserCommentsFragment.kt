package com.example.moviesmania.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesmania.adapters.UserCommentsAdapter
import com.example.moviesmania.commentsRoom.UserCommentsDao
import com.example.moviesmania.commentsRoom.UserCommentsDatabase
import com.example.moviesmania.commentsRoom.UserCommentsEntity
import com.example.moviesmania.databinding.UserCommentsFragmentBinding
import kotlinx.coroutines.launch

class UserCommentsFragment : Fragment() {

    private var binding: UserCommentsFragmentBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = UserCommentsFragmentBinding.inflate(inflater, container, false)
        return binding!!.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userCommentsDao = UserCommentsDatabase.getInstance(requireContext()).userCommentsDao()
        lifecycleScope.launch {
            userCommentsDao.getAllUserComments().collect {
                setCommentsIntoList(it, userCommentsDao)
            }
        }
    }

    private fun setCommentsIntoList(
        userCommentsList: List<UserCommentsEntity>,
        userCommentsDao: UserCommentsDao
    ) {
        if (userCommentsList.isNotEmpty()) {
            val userCommentsAdapter = UserCommentsAdapter(userCommentsList)
            binding?.rvUserComments?.layoutManager = LinearLayoutManager(context)
            binding?.rvUserComments?.adapter = userCommentsAdapter
        }
    }

}