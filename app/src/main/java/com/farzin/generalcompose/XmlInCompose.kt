package com.farzin.generalcompose

import android.content.Context
import android.view.Gravity
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.viewinterop.AndroidView


@Composable
fun Xml(context:Context) {


    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        AndroidView(
            factory = {
                TextView(it)
            },
            modifier = Modifier
                .fillMaxWidth()
        ) { textView ->

            textView.apply {
                text = "Xml in Compose"
                textColors.defaultColor
                gravity = Gravity.CENTER
                textSize = 20f
            }


        }

        AndroidView(
            factory = {
                Button(it)
            }
        ){btn ->

            btn.apply {
                text = "MyButton"
                layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                setOnClickListener{
                    Toast.makeText(context, "Hi XML ", Toast.LENGTH_LONG).show()
                }

            }

        }
    }

}