package com.farzin.generalcompose

import androidx.compose.material.AlertDialog
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import kotlin.system.exitProcess

var dialogState = mutableStateOf(false)

@Composable
fun ExitAlertDialog() {
    MaterialTheme {
        val opendialog = remember {
            dialogState
        }

        if (opendialog.value) {
            AlertDialog(onDismissRequest = {
                opendialog.value = false
            },

                title = {
                    Text(text = "Exit App")
                },

                text = {
                    Text(text = "Are You Sure?")
                },

                confirmButton = {
                    TextButton(onClick = {
                        opendialog.value = true
                        exitProcess(0)
                    })
                    {
                        Text(text = "Yes")
                    }
                },

                dismissButton = {
                    TextButton(onClick = { opendialog.value = false }) {
                        Text(text = "No")
                    }
                }

            )
        }


    }
}