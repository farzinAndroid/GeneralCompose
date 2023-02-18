package com.farzin.generalcompose

import android.graphics.Insets
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import me.nikhilchaudhari.library.NeuInsets
import me.nikhilchaudhari.library.neumorphic
import me.nikhilchaudhari.library.shapes.NeuShape
import me.nikhilchaudhari.library.shapes.Pot
import me.nikhilchaudhari.library.shapes.Pressed
import me.nikhilchaudhari.library.shapes.Punched



@Composable
fun NeuMorphismCard() {
    Card(
        backgroundColor = Color(236, 234, 235),
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .padding(16.dp)
            .size(300.dp, 100.dp)
            .neumorphic(
                neuShape =
                // Punched shape
                Punched.Rounded(radius = 8.dp)
//                        Punched.Oval()
//
//                        // Presssed Shape
//                        Pressed.Rounded(radius = 4.dp)
//                        Presssed.Oval()
//
//                        // Pot shape
//                        Pot.Rounded(radius = 8.dp)
//                        Pot.Oval()
            )
    ) {

        Text(text = "Hello", modifier = Modifier
            .padding(20.dp)
        )
    }
}

@Composable
fun SimpleDesignCard() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Card(
            backgroundColor = Color(236, 234, 235),
            elevation = 0.dp,
            shape = RoundedCornerShape(6.dp),
            modifier = Modifier
                .padding(16.dp)
                .size(400.dp, 350.dp)
                .neumorphic(
                    neuShape = Pot.Rounded(6.dp),
                    strokeWidth = 7.dp,
//                    neuInsets = NeuInsets(8.dp, 8.dp)
                )
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                SimpleOvalCard(
                    resource = R.drawable.bitcoin,
                    size = 64.dp
                )

                Row(
                    modifier = Modifier
                        .size(300.dp, 150.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .neumorphic(neuShape = Pressed.Rounded(12.dp))
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Farzin",
                        textAlign = TextAlign.Center, modifier = Modifier.padding(4.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    PunchedButton(

                        btnShape = CircleShape,
                        text = "Always",
                        neuInsets = NeuInsets(6.dp),
                        neuShape = Punched.Oval()
                    )
                    PunchedButton(

                        btnShape = CircleShape,
                        text = "Never",
                        neuInsets = NeuInsets(6.dp),
                        neuShape = Punched.Oval()
                    )
                }

            }
        }
    }
}

@Composable
fun PressedRow() {
    Row(
        modifier = Modifier
            .padding(18.dp)
            .size(400.dp, 100.dp)
            .background(Color(236, 234, 235))
            .clip(RoundedCornerShape(12.dp))
            .neumorphic(neuShape = Pressed.Rounded(12.dp)),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painterResource(id = R.drawable.bitcoin),
            contentDescription = "image", modifier = Modifier
                .size(80.dp)
                .padding(12.dp)
        )
        Text(
            text = "Simple Row wih Pressed shape.",
            textAlign = TextAlign.Center
        )
    }
}


@Composable
fun PotCard() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            backgroundColor = Color(236, 234, 235),
            elevation = 0.dp,
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .padding(16.dp)
                .size(300.dp, 100.dp)
                .neumorphic(
                    neuShape = Pot.Rounded(12.dp),
                    elevation = 12.dp,
                    strokeWidth = 8.dp,
                    neuInsets = NeuInsets(10.dp, 10.dp)
                )
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painterResource(id = R.drawable.bitcoin),
                    contentDescription = "image", modifier = Modifier
                        .size(80.dp)
                        .padding(12.dp)
                )
                Text(
                    text = "Sample card wih Pot/Puddle/Basin shape.",
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun PunchedButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (i in 1..2) {
            PunchedButton(
                btnShape = RoundedCornerShape(6.dp),
                text = "Button $i",
                neuShape = Punched.Rounded(6.dp),
            )
        }
    }
}


@Composable
fun PunchedCards() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        val resourceArray = arrayOf(
            R.drawable.bitcoin,
            R.drawable.bitcoin,
            R.drawable.bitcoin
        )

        for (i in 0..2) {
            SimpleOvalCard(resource = resourceArray[i])
        }
    }
}

@Composable
fun PunchedButton(
    btnShape: Shape, text: String, neuShape: NeuShape,
    neuInsets: NeuInsets = NeuInsets(4.dp, 4.dp)
) {
    Button(
        onClick = { /*TODO*/ },
        contentPadding = PaddingValues(16.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(236, 234, 235)),
        elevation = ButtonDefaults.elevation(0.dp),
        shape = btnShape,
        modifier = Modifier
            .padding(12.dp)
            .neumorphic(
                neuShape = neuShape,
                neuInsets = neuInsets
            )
    ) {
        Text(text = text)
    }
}


@Composable
fun SimpleOvalCard(resource: Int, size: Dp = 32.dp) {
    Card(
        backgroundColor = Color(236, 234, 235),
        elevation = 0.dp,
        border = BorderStroke(2.dp, Color(236, 234, 235)),
        shape = CircleShape, modifier = Modifier
            .size(100.dp)
            .padding(16.dp)
            .neumorphic(neuShape = Punched.Oval())
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painterResource(id = resource),
                contentDescription = "image", modifier = Modifier.size(size)
            )
        }
    }
}

