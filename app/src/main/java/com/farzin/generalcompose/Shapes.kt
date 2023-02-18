package com.farzin.generalcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp

@Composable
fun ShapeGenerator(shape: Shape, width: Dp, height: Dp, color: Color, modifier: Modifier) {
    Column(modifier) {

        Box(modifier = Modifier
            .clip(shape)
            .width(width)
            .height(height)
            .background(color)
        )

    }
}