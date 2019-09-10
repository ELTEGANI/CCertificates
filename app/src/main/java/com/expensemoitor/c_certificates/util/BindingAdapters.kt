package com.expensemoitor.c_certificates.util

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.expensemoitor.c_certificates.adapter.CertificatesAdapter
import com.expensemoitor.c_certificates.network.CertificatesResponse


@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data:List<CertificatesResponse>?){
    val adapter = recyclerView.adapter as CertificatesAdapter
    adapter.submitList(data)
}

@BindingAdapter("certifacteName")
fun TextView.setcertifacteName(certificatesResponse:CertificatesResponse?){
    certificatesResponse?.let {
        text = certificatesResponse.certifacteName
    }
}


@BindingAdapter("certifacteDate")
fun TextView.setcertificateDate(certificatesResponse:CertificatesResponse?){
    certificatesResponse?.let {
        text = certificatesResponse.certifacteDate
    }
}
