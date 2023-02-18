package com.farzin.generalcompose.composeNavugation

import android.util.Log
import android.widget.Toast
import androidx.navigation.NavHostController

class LoginRepository(
    private val auth:Authenticator,
    private val navController:NavHostController,
    private val errorHandling: NewErrorHandling
) {

    fun loginUser(userName:String, password:String){
        val isLogin = auth.signInWithUserNameAndPassword(userName, password)

        if (isLogin){
            Log.e("TAG", "You are Logged In")
            navController.navigate(Screen.Second.withArgs(userName, password))
        }else{
            errorHandling.errorHandler(userName,password,"Username or Password Incorrect", "192.168.300.12")
        }
    }


}