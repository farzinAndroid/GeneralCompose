package com.farzin.generalcompose.composeNavugation

sealed class Screen(val route:String){
    object Home:Screen(route = "home_screen")
    object Second:Screen(route = "second_screen")

    fun withArgs(vararg args:String):String{
        return buildString {
            append(route)

            args.forEach {arg->
                append("/$arg")
            }
        }
    }
}
