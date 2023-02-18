package com.farzin.generalcompose

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun AnimateColorChange() {

    var isNeedChangeColor by remember {
        mutableStateOf(false)
    }

    val startColor = Color.Green
    val endColor = Color.Yellow

    val backGround by animateColorAsState(
        targetValue = if (isNeedChangeColor) endColor else startColor,
        animationSpec = tween(
            durationMillis = 1000,
            delayMillis = 100
        )
    )

    Column() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7f)
                .background(backGround)
        )


        Button(onClick = {

            isNeedChangeColor = !isNeedChangeColor

        }) {
            Text(text = "Change")
        }
    }
}

@Composable
fun RotateAnimation() {

    var isRotate by remember {
        mutableStateOf(false)
    }

    val rotate by animateFloatAsState(
        targetValue = if (isRotate) 360f else 0f,
        animationSpec = tween(durationMillis = 2000)
    )

    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bitcoin),
            contentDescription = "",
            modifier = Modifier
                .rotate(rotate))

        Button(onClick = {

            isRotate = !isRotate

        }) {
            Text(text = "Rotate")
        }
    }
}

@Composable
fun InfiniteTransition() {

    val infiniteTransition = rememberInfiniteTransition()

    val size by infiniteTransition.animateFloat(
        initialValue = 100.0f,
        targetValue = 200.0f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, 100),
            repeatMode = RepeatMode.Reverse
        )
    )

    Image(
        painter = painterResource(id = R.drawable.bitcoin),
        contentDescription = "",
        modifier = Modifier
            .size(size.dp)
    )

}

@Composable
fun AnimateAsDP() {

    var sizeState by remember {
        mutableStateOf(100.dp)
    }

    val size by animateDpAsState(
        targetValue = sizeState,
        animationSpec = tween(
            delayMillis = 100,
            durationMillis = 3000
        )
    )

    Column(modifier = Modifier
        .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bitcoin),
            contentDescription = "",
            modifier = Modifier
                .size(size)
        )

        Button(onClick = {

            sizeState += 50.dp

        }) {
            Text(text = "change size")
        }
    }


}