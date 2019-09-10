package com.expensemoitor.c_certificates.profile

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.expensemoitor.c_certificates.R

class StudentProfileFragment : Fragment() {

    companion object {
        fun newInstance() = StudentProfileFragment()
    }

    private lateinit var viewModel: StudentProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.student_profile_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(StudentProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
