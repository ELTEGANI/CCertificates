package com.expensemoitor.c_certificates.util

import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.expensemoitor.c_certificates.R
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

@BindingAdapter("imageUrl")
fun bindImage(imageView: ImageView,imageUrl:String?){
      imageUrl?.let {
        val imageUrl = imageUrl.toUri().buildUpon().scheme("https").build()
        Glide.with(imageView.context)
            .load(imageUrl)
            .apply(RequestOptions()
                .placeholder(R.drawable.loading_animation)
                .error(R.drawable.ic_broken_image))
            .into(imageView)
      }
}
