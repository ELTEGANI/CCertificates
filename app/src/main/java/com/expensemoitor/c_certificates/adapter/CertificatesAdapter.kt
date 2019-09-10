package com.expensemoitor.c_certificates.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.expensemoitor.c_certificates.databinding.CertificateViewItemBinding
import com.expensemoitor.c_certificates.network.CertificatesResponse

class CertificatesAdapter : ListAdapter<CertificatesResponse, CertificatesAdapter.ViewHolder>
    (CertificatesResponseDiffCallback()){


    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
         holder.bind(getItem(position)!!)
    }


    class ViewHolder private constructor(val binding: CertificateViewItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind (certificatesResponse: CertificatesResponse){
            binding.certificatesResponse = certificatesResponse
            binding.executePendingBindings()
        }

        companion object{
            fun from (parent: ViewGroup):ViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = CertificateViewItemBinding.inflate(layoutInflater,parent,false)
                return ViewHolder(binding)
            }
        }
    }

    class CertificatesResponseDiffCallback:DiffUtil.ItemCallback<CertificatesResponse>() {
        override fun areItemsTheSame(oldItem: CertificatesResponse,newItem: CertificatesResponse): Boolean {
         return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: CertificatesResponse,newItem: CertificatesResponse): Boolean {
         return oldItem == newItem
        }

    }

}