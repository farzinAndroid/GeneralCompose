package com.farzin.generalcompose.ui.theme


import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color


enum class CustomTheme {

    DARK, LIGHT


}


val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)


val dark22 = Color(0xFF202020)
val lightCC = Color(0xFFF0F0F0)

@Stable
class CustomColors(
    buttonBackGroundColors: Color,
    buttonTextColor: Color,
    textColor: Color,
    backGroundColor: Color,
    appBarContentTextColor: Color,
    topAppbarBackGround: Color,
    bottomAppbarBackground: Color,
    bottomAppbarContentColor: Color,
    bitCoinBackgroundColor: Color,
    bitCoinTextColor: Color,
    expandableCardTitleColor: Color,
) {

    var buttonBackGroundColors by mutableStateOf(buttonBackGroundColors)
        private set

    var buttonTextColor by mutableStateOf(buttonTextColor)
        private set

    var textColor by mutableStateOf(textColor)
        private set

    var backGroundColor by mutableStateOf(backGroundColor)
        private set

    var appBarContentTextColor by mutableStateOf(appBarContentTextColor)
        private set

    var topAppbarBackGround by mutableStateOf(topAppbarBackGround)
        private set

    var bottomAppbarBackground by mutableStateOf(bottomAppbarBackground)
        private set

    var bottomAppbarContentColor by mutableStateOf(bottomAppbarContentColor)
        private set

    var bitCoinBackgroundColor by mutableStateOf(bitCoinBackgroundColor)
        private set

    var bitCoinTextColor by mutableStateOf(bitCoinTextColor)
        private set

    var expandableCardTitleColor by mutableStateOf(expandableCardTitleColor)
        private set


    fun update(colors: CustomColors) {
        this.backGroundColor = colors.backGroundColor
        this.buttonBackGroundColors = colors.buttonBackGroundColors
        this.buttonTextColor = colors.buttonTextColor
        this.textColor = colors.textColor
        this.appBarContentTextColor = colors.appBarContentTextColor
        this.topAppbarBackGround = colors.topAppbarBackGround
        this.bottomAppbarBackground = colors.bottomAppbarBackground
        this.bottomAppbarContentColor = colors.bottomAppbarContentColor
        this.bitCoinBackgroundColor = colors.bitCoinBackgroundColor
        this.bitCoinTextColor = colors.bitCoinTextColor
        this.expandableCardTitleColor = colors.expandableCardTitleColor
    }

    fun initColors() = CustomColors(buttonBackGroundColors,
        buttonTextColor,
        textColor,
        backGroundColor,
        appBarContentTextColor,
        topAppbarBackGround,
        bottomAppbarBackground,
        bottomAppbarContentColor,
        bitCoinBackgroundColor,
        bitCoinTextColor,
        expandableCardTitleColor
    )


}