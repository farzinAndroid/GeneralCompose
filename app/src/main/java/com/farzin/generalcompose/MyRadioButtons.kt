package com.farzin.generalcompose

import android.util.Log
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyRadioButtons() {

    val radioList = listOf("radio1", "radio2", "radio3")

    val (selectedOption, onOptionSelected) = remember {
        mutableStateOf(radioList[1])
    }


    Row(modifier = Modifier.fillMaxWidth()) {
        radioList.forEach { text ->

            Row(modifier = Modifier
                .padding(12.dp)
                .selectable(selected = (text == selectedOption),
                    onClick = {
                        onOptionSelected(text)
                        Log.e("TAG", text)
                    }),
                verticalAlignment = Alignment.CenterVertically


            ) {

                RadioButton(selected = (text == selectedOption),
                    onClick = {
                        onOptionSelected(text)
                        Log.e("TAG", text)
                    })

                Text(
                    text = text
                )
            }

        }
    }


}