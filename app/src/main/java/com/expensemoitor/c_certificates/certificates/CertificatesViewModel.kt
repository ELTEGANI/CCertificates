package com.expensemoitor.c_certificates.certificates

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.expensemoitor.c_certificates.network.ApiFactory
import com.expensemoitor.c_certificates.network.CertificatesResponse
import kotlinx.coroutines.*


class CertificatesViewModel : ViewModel() {

    private val viewModel = Job()
    private val coroutineJob = CoroutineScope(viewModel+Dispatchers.Main)

    private val _certificatesProperites = MutableLiveData<List<CertificatesResponse>>()
    val certificatesProperites:LiveData<List<CertificatesResponse>>
    get() = _certificatesProperites


    init {
        getCertificates()
    }


    private fun getCertificates(){
        coroutineJob.launch {
            val getMyCertificatesResponse = ApiFactory.GET_ALL_CERTIFICATES.getMyCertificates()
            try {
                 val getMyCertificatesList = getMyCertificatesResponse.await()
                _certificatesProperites.value = getMyCertificatesList
                Log.d("getMyCertificatesList",getMyCertificatesList.toString())
            }catch (t:Throwable){
                _certificatesProperites.value = ArrayList()
                Log.d("failureResponse",t.toString())
            }
        }
    }


    override fun onCleared() {
        super.onCleared()
        viewModel.cancel()
    }

}
