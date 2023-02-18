package com.farzin.generalcompose

import androidx.compose.material.Checkbox
import androidx.compose.runtime.*


@Composable
fun MyCheckBox() {

    var checkState by remember {
        mutableStateOf(false)
    }

    Checkbox(
        checked = checkState,
        onCheckedChange = {
            checkState = it
        },

        )
}