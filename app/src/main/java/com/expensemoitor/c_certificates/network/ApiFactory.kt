package com.expensemoitor.c_certificates.network

import com.expensemoitor.c_certificates.util.AppConstants

object ApiFactory {
    val GET_ALL_CERTIFICATES:GetMyCertificates = RetrofitFactory.retrofit(AppConstants.BASEURL)
        .create(GetMyCertificates::class.java)
}