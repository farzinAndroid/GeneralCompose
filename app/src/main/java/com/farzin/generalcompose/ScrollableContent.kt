package com.farzin.generalcompose

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun ScrollableContent() {

    LazyColumn(modifier = Modifier
        .padding(bottom = 50.dp)
    ) {
        items(count = 25) {
            WalletItem(
                name = "BitCoin$it",
                modifier = Modifier
                    .padding(start = 12.dp, bottom = 10.dp, top = 10.dp, end = 12.dp)
                    .fillMaxWidth()
                    .clickable(
                        onClick = {

                        },

                        interactionSource = remember {
                            MutableInteractionSource()
                        },

                        indication = rememberRipple(
                            bounded = true,
                            color = Color.Blue
                        )
                    ))
        }
    }
}