package com.farzin.generalcompose

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.farzin.generalcompose.ui.theme.CustomThemeManager


@Composable
fun WalletItem(name: String, modifier:Modifier) {

    Card(modifier = modifier,
        elevation = 10.dp,
        shape = RoundedCornerShape(10.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(CustomThemeManager.colors.bitCoinBackgroundColor)
        )
        {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.15f)
                    .padding(8.dp)
            ) {
                CircularImage(
                    painter = painterResource(id = R.drawable.bitcoin),
                    size = 32.dp)
            }

            Column(modifier = Modifier
                .padding(8.dp)
                .weight(0.475f)
            ) {

                Text(
                    text = name,
                    color = CustomThemeManager.colors.bitCoinTextColor,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )

                Text(
                    color = CustomThemeManager.colors.bitCoinTextColor,//Color(0xFF4B4B4B),
                    text = "BTC/USD",
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
            }

            Column(modifier = Modifier
                .padding(top = 8.dp, bottom = 8.dp, end = 16.dp)
                .weight(0.475f),
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = "BTC 0.07643",
                    color = CustomThemeManager.colors.bitCoinTextColor,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )

                Text(
                    color = Color(0xFF1AA702),
                    text = "$900",
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
            }

        }

    }
}