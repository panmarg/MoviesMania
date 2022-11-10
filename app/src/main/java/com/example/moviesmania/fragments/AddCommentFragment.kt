package com.example.moviesmania.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.moviesmania.commentsRoom.*
import com.example.moviesmania.databinding.AddCommentFragmentBinding
import com.example.moviesmania.viewmodel.UserCommentsViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.Calendar

@AndroidEntryPoint
class AddCommentFragment : Fragment() {

    private var binding: AddCommentFragmentBinding? = null
    private val userCommentsViewModel: UserCommentsViewModel by activityViewModels()


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
        binding?.tvAddComment?.text = "Add Comment"


        binding?.clAddComment?.setOnClickListener {
            val username = binding?.etUsername?.text.toString()
            val comment = binding?.etComment?.text.toString()
            val currentTime = getCurrentTime()
            if (username.isNotEmpty() && comment.isNotEmpty()) {
                userCommentsViewModel.addComment(UserCommentsEntity(username, comment, currentTime))
                Toast.makeText(context, "Comment Added!", Toast.LENGTH_LONG).show()
                binding?.etUsername?.text?.clear()
                binding?.etComment?.text?.clear()

            } else {
                Toast.makeText(context, "Username and Comment cannot be blank!", Toast.LENGTH_LONG)
                    .show()

            }


        }

    }


    private fun getCurrentTime () : String {
        val time = Calendar.getInstance().time
        val formatter = SimpleDateFormat("dd MMMM yyyy HH:mm")
        val current = formatter.format(time)
        return current.toString()
    }


}