package com.farzin.generalcompose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MySwitch() {

    var switchState by remember {
        mutableStateOf(false)
    }

    Row(modifier = Modifier
        .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    )
    {

        Switch(
            checked = switchState,
            onCheckedChange = {
                switchState = it

            }
        )

        Text(text = switchState.toString())
    }
}