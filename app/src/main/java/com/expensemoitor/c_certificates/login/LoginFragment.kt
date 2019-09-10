package com.expensemoitor.c_certificates.login

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.expensemoitor.c_certificates.R



class LoginFragment : Fragment() {

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {


        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)


        return inflater.inflate(R.layout.login_fragment, container, false)


    }

}
