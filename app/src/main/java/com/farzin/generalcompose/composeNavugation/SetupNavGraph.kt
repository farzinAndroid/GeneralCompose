package com.farzin.generalcompose.composeNavugation

import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun SetupNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route) {

        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController)
        }

        composable(
            route = Screen.Second.route + "/{name}/{pass}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                },
                navArgument("pass") {
                    type = NavType.StringType
                }
            )

        ) {

            SecondScreen(
                navHostController = navController,
                name = it.arguments?.getString("name").toString(),
                password = it.arguments?.getString("pass").toString()
                )


        }
    }
}