package com.example.moviesmania.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.moviesmania.adapters.UserCommentsAdapter
import com.example.moviesmania.commentsRoom.*
import com.example.moviesmania.databinding.AddCommentFragmentBinding
import kotlinx.coroutines.launch

class AddCommentFragment : Fragment() {

    private var binding: AddCommentFragmentBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AddCommentFragmentBinding.inflate(inflater, container, false)

        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userCommentsDao = UserCommentsDatabase.getInstance(requireContext()).userCommentsDao()


        binding?.tvAddComment?.text = "Add Comment"
        binding?.clAddComment?.setOnClickListener {
          addComment(userCommentsDao)
        }

    }

    private fun addComment(userCommentDao: UserCommentsDao){
        val username = binding?.etUsername?.text.toString()
        val comment = binding?.etComment?.text.toString()
        if(username.isNotEmpty() && comment.isNotEmpty()){
            lifecycleScope.launch {
                userCommentDao.insertComment(UserCommentsEntity(username=username, comment = comment))
                Toast.makeText(context, "Comment Added!", Toast.LENGTH_LONG).show()
                binding?.etUsername?.text?.clear()
                binding?.etComment?.text?.clear()
            }
        }else{
            Toast.makeText(context, "Username and Comment cannot be blank!", Toast.LENGTH_LONG).show()

        }
    }


}