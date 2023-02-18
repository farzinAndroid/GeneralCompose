package com.farzin.generalcompose.composeNavugation

import android.util.Log

open class ErrorHandling {

    open fun errorHandler(
        userName: String,
        password: String,
        errorMessage: String,
        ip: String,
    ) {
        Log.e("TAG", errorMessage)
        Log.e("TAG", "user IP : $ip")
        Log.e("TAG", "Wrong username:$userName - Wrong password:$password")
    }
}


//open/close
class NewErrorHandling : ErrorHandling() {

    override fun errorHandler(
        userName: String,
        password: String,
        errorMessage: String,
        ip: String,
    ) {
        Log.e("TAG", errorMessage)
    }
}


