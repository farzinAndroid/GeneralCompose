package com.farzin.generalcompose

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun CanvasPractice() {

    Canvas(
        modifier = Modifier
            .fillMaxSize()
    ) {
        drawLine(
            strokeWidth = 10f,
            color = Color.Red,
            start = Offset(0f,90f),
            end = Offset(500f,1000f),
        )

        drawArc(
            color = Color.Cyan,
            startAngle = 0f,
            sweepAngle = -90f,
            useCenter = true,
            size = Size(300f,300f),
            topLeft = Offset(200f,100f)
        )

        drawCircle(
            color = Color.Blue,
            center = Offset(500f,1000f),
            radius = 100f
        )

        drawRect(
            color = Color.DarkGray,
            topLeft = Offset(650f,400f),
            size = Size(200f,600f)
        )

    }
}

@Composable
fun InstagramLogo(){

    val colors = listOf(
        Color.Magenta,
        Color.Red,
        Color.Yellow
    )


    Canvas(modifier = Modifier
        .padding(20.dp)
        .size(100.dp)
    ){
        drawRoundRect(
            brush = Brush.linearGradient(colors = colors),
            cornerRadius = CornerRadius(60f,60f),
            style = Stroke(20f, cap = StrokeCap.Round)
        )

        drawCircle(
            brush = Brush.linearGradient(colors = colors),
            center = Offset(this.size.width*0.50f,this.size.height*0.50f),
            radius = 60f,
            style = Stroke(20f, cap = StrokeCap.Round)
        )

        drawCircle(
            brush = Brush.linearGradient(colors = colors),
            center = Offset(this.size.width*0.80f,this.size.height*0.20f),
            radius = 12f
        )
    }







}