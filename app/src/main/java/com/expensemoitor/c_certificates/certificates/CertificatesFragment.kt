package com.expensemoitor.c_certificates.certificates

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import com.expensemoitor.c_certificates.adapter.CertificatesAdapter
import com.expensemoitor.c_certificates.databinding.CertificatesFragmentBinding


class CertificatesFragment : Fragment() {

    private val viewModel: CertificatesViewModel by lazy {
        ViewModelProviders.of(this).get(CertificatesViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val binding = CertificatesFragmentBinding.inflate(inflater)


        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        val adapter = CertificatesAdapter()
        binding.certificatesList.itemAnimator = DefaultItemAnimator()
        binding.certificatesList.adapter = adapter

        return binding.root

    }
}
