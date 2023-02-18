package com.farzin.generalcompose

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun MyTextField() {

    var textSate by remember {
        mutableStateOf(TextFieldValue())
    }

    Column(modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        OutlinedTextField(
            value = textSate,
            onValueChange = {
                textSate = it
            }
        )

        Text(text = "text is: ${textSate.text}")


        Row {

            Button(modifier = Modifier
                .padding(10.dp),
                onClick = {
                    Log.e("TAG", textSate.text)
                }) {

                Text(text = "Login")

            }




            OutlinedButton(modifier = Modifier
                .padding(10.dp), onClick = {
                Log.e("TAG", textSate.text)
            }) {

                Text(text = "Register")

            }
        }


        Row(verticalAlignment = Alignment.CenterVertically) {

            TextButton(modifier = Modifier
                .padding(10.dp), onClick = {
                Log.e("TAG", textSate.text)
            }) {

                Text(text = "Forgot Password?")

            }

            MyCheckBox()
        }


        MyRadioButtons()

        MySwitch()


    }
}