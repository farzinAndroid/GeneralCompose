package com.farzin.generalcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InsertImg(painter: Painter, title: String, desc: String, price: String) {

    Image(painter = painter,
        contentDescription = "",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .fillMaxWidth()
            .height(200f.dp)
    )

    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 12.dp, start = 12.dp)
        )
        Text(text = price,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.Magenta,
            modifier = Modifier
                .padding(end = 12.dp, top = 12.dp)
        )
    }


    Text(text = desc,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        modifier = Modifier
            .padding(top = 12.dp, start = 12.dp, bottom = 35.dp)
    )


}


@Composable
fun CircularImage(painter: Painter, size: Dp) {
    Image(
        painter = painter,
        contentDescription = "image",
        modifier = Modifier
            .clip(CircleShape)
            .size(size)


    )
}