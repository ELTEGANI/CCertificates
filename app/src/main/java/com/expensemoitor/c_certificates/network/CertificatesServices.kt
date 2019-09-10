package com.expensemoitor.c_certificates.network

import com.expensemoitor.c_certificates.util.AppConstants
import kotlinx.coroutines.Deferred
import retrofit2.http.GET


interface GetMyCertificates{
    @GET(AppConstants.GETALLCERTIFICATES)
    fun getMyCertificates():Deferred<List<CertificatesResponse>>
}