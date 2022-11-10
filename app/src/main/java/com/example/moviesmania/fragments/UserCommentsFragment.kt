package com.example.moviesmania.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.moviesmania.databinding.UserCommentsFragmentBinding
import com.example.moviesmania.viewmodel.UserCommentsViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesmania.adapters.UserCommentsAdapter
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class UserCommentsFragment : Fragment() {

    private var binding: UserCommentsFragmentBinding? = null
    private val userCommentsViewModel: UserCommentsViewModel by activityViewModels()


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
        val userCommentsAdapter =
            UserCommentsAdapter(userCommentsViewModel.userComments.value ?: listOf())
        binding?.rvUserComments?.layoutManager = LinearLayoutManager(context)
        binding?.rvUserComments?.adapter = userCommentsAdapter
        userCommentsViewModel.userComments.observe(viewLifecycleOwner){
            userCommentsAdapter.updateUserCommentsList(it)
            if(it.isNotEmpty()){
                binding?.tvNoComments?.visibility = View.GONE
            }
        }


    }


}



