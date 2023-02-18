package com.farzin.generalcompose.composeNavugation

interface Authenticator {

    fun signInWithUserNameAndPassword(userName:String, password:String):Boolean
}

class RestAuth:Authenticator{
    override fun signInWithUserNameAndPassword(userName: String, password: String): Boolean {
        TODO("Not yet implemented")
    }
}

class FakeAuth:Authenticator {

    private val userName  = "farzin"
    private val password = "123"

    override fun signInWithUserNameAndPassword(userName:String, password:String):Boolean{
        return this.userName == userName && this.password == password

    }
}