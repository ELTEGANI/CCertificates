package com.expensemoitor.c_certificates.certificatesDetailes

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.expensemoitor.c_certificates.R

class CertificatesDetailesFragment : Fragment() {

    companion object {
        fun newInstance() = CertificatesDetailesFragment()
    }

    private lateinit var viewModel: CertificatesDetailesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.certificates_detailes_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CertificatesDetailesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
