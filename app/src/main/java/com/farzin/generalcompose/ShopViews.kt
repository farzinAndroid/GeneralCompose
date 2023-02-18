package com.farzin.generalcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardViewShop(title: String, realPrice: String, image: Painter) {

    Card(elevation = 20.dp,
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .width(180.dp)


    ) {

        Column(modifier = Modifier.padding(12.dp)) {
            Image(
                painter = image,
                contentScale = ContentScale.FillBounds,

                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)


            )



            Row(modifier = Modifier
                .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                Text(
                    text = realPrice,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.Red,
                    textDecoration = TextDecoration.LineThrough
                )


            }


        }


    }
}

@Composable
fun BoxShop(title: String, realPrice: String, discount: String, image: Painter) {
    Card(modifier = Modifier
        .fillMaxWidth(),
        elevation = 20.dp,
        shape = RoundedCornerShape(20.dp)
    ) {


        Box(modifier = Modifier
            .height(200.dp)
        ) {
            Image(painter = image,
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(listOf(
                    Color.Transparent,
                    Color.White
                )))
            )
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.BottomCenter) {
                Text(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(12.dp)
                )
            }


        }
    }
}