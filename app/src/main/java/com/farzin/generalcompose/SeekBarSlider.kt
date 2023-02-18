package com.farzin.generalcompose

import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import kotlin.math.roundToInt

@Composable
fun SeekBarSlider() {

    var state by remember {
        mutableStateOf(0f)
    }

    Slider(
        value = state,
        onValueChange = {
            state = it
        }
    )

    Text(text = (state * 100).roundToInt().toString())
}