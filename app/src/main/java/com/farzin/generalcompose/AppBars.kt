package com.farzin.generalcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.farzin.generalcompose.ui.theme.CustomThemeManager
import com.farzin.generalcompose.ui.theme.Purple200

@Composable
fun BottomAppBarView() {

    var state by remember {
        mutableStateOf("")
    }
    var homestate by remember {
        mutableStateOf(true)
    }

    BottomAppBar(
        backgroundColor = CustomThemeManager.colors.bottomAppbarBackground,
        contentColor = CustomThemeManager.colors.bottomAppbarContentColor
    ) {

        BottomNavigationItem(
            selected = homestate,
            onClick = {
                state = "Home"
                homestate = true
            },
            icon = {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "")
            },

            label = {
                Text(text = "Home")
            },

            )

        BottomNavigationItem(
            selected = state == "Settings",
            onClick = {
                state = "Settings"
                homestate = false
            },
            label = {
                Text(text = "Settings")
            },
            icon = {
                Icon(Icons.Filled.Settings, contentDescription = "")
            }

        )

        BottomNavigationItem(selected = state == "Search",
            onClick = {
                state = "Search"
                homestate = false
            },
            label = {
                Text(text = "Search")
            },
            icon = {
                Icon(Icons.Filled.Search, contentDescription = "")
            }

        )

    }
}


@Composable
fun MyAppBar() {
    Column {
        TopAppBar(
            elevation = 10.dp,
            backgroundColor = CustomThemeManager.colors.topAppbarBackGround,
            title = {
                Text(text = "Compose")
            },
            actions = {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Filled.Search, null)
                }

                IconButton(onClick = { dialogState.value = true }) {
                    Icon(Icons.Filled.ArrowForward, null)
                }


            },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Filled.Menu, null)
                }
            },

            contentColor = CustomThemeManager.colors.appBarContentTextColor


        )

    }
}