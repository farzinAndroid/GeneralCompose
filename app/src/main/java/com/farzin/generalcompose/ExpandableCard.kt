package com.farzin.generalcompose

import android.content.Context
import android.widget.Toast
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farzin.generalcompose.ui.theme.CustomColors
import com.farzin.generalcompose.ui.theme.CustomThemeManager


@ExperimentalMaterialApi
@Composable
fun ExpandableCard() {

    val context = LocalContext.current

    var expandState by remember {
        mutableStateOf(false)
    }

    val rotate by animateFloatAsState(
        targetValue = if (expandState) 180f else 0f,
    )



    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .animateContentSize(
                animationSpec = tween(
                    delayMillis = 100
                )
            ),
        shape = RoundedCornerShape(10.dp),
        /*onClick = {
            expandState = !expandState
        }*/
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(8.dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "My Title",
                    fontWeight = FontWeight.Bold,
                    color = CustomThemeManager.colors.expandableCardTitleColor,
                    fontSize = 16.sp
                )

                IconButton(
                    modifier = Modifier
                        .alpha(ContentAlpha.medium)
                        .rotate(rotate),

                    onClick = {
                        expandState = !expandState
                    },
                )
                {
                    Icon(
                        Icons.Filled.ArrowDropDown,

                        contentDescription = "",
                        tint = CustomThemeManager.colors.expandableCardTitleColor
                    )
                }
            }


            if (expandState) {
                LazyColumn(
                    modifier = Modifier
                        .padding(bottom = 40.dp)
                ) {

                    items(count = 50) {
                        WalletItem(name = "BitCoin$it", modifier = Modifier
                            .padding(start = 12.dp, bottom = 10.dp, top = 10.dp, end = 12.dp)
                            .fillMaxWidth()
                            .clickable(
                                onClick = {
                                    Toast
                                        .makeText(context, "Clicked", Toast.LENGTH_LONG)
                                        .show()
                                },

                                interactionSource = remember {
                                    MutableInteractionSource()
                                },

                                indication = rememberRipple(
                                    bounded = true,
                                    color = Color.Blue
                                )
                            )

                        )
                    }
                }
            }

        }


    }
}