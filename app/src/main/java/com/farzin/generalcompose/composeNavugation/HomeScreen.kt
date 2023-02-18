package com.farzin.generalcompose.composeNavugation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@Composable
fun HomeScreen(
    navHostController: NavHostController,
) {

    var userNameValue by remember {
        mutableStateOf("")
    }

    var passWordValue by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Home")
        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = userNameValue, onValueChange = {
                userNameValue = it
            },
            label = { Text(text = "Name") }
        )

        OutlinedTextField(
            value = passWordValue, onValueChange = {
                passWordValue = it
            },
            label = { Text(text = "Password") }
        )

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {


            LoginRepository(FakeAuth(),navHostController,NewErrorHandling()).loginUser(userNameValue,passWordValue)

        }) {
            Text(text = "Go To Second Screen")
        }
    }
}