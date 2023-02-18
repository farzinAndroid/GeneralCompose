package com.farzin.generalcompose.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color


private val CustomDarkColors = CustomColors(
    backGroundColor = dark22,
    buttonBackGroundColors = Teal200,
    buttonTextColor =lightCC ,
    textColor = lightCC,
    appBarContentTextColor = lightCC,
    topAppbarBackGround = Purple700,
    bottomAppbarBackground = Purple700,
    bottomAppbarContentColor = lightCC,
    bitCoinBackgroundColor = lightCC,
    bitCoinTextColor = dark22,
    expandableCardTitleColor = dark22
)

private val CustomLightColors = CustomColors(
    backGroundColor = lightCC,
    buttonBackGroundColors = Purple500,
    buttonTextColor =Teal200 ,
    textColor = dark22,
    appBarContentTextColor = dark22,
    topAppbarBackGround = Purple200,
    bottomAppbarBackground = Purple200,
    bottomAppbarContentColor = dark22,
    bitCoinBackgroundColor = Color.Gray,
    bitCoinTextColor = lightCC,
    expandableCardTitleColor = dark22
)

private val LocalColorsProvider = staticCompositionLocalOf {
    CustomLightColors
}

@Composable
private fun CustomLocalProvider(
    colors: CustomColors,
    content: @Composable () -> Unit
){
    val colorsPalette = remember {
        colors.initColors()
    }

    colorsPalette.update(colors)

    CompositionLocalProvider(
        LocalColorsProvider provides colorsPalette,
        content = content
    )
}


private val CustomTheme.colors:Pair<Colors, CustomColors>
get() = when (this){
    CustomTheme.DARK -> darkColors() to CustomDarkColors
    CustomTheme.LIGHT -> lightColors() to CustomLightColors
}

object CustomThemeManager{
    val colors:CustomColors
    @Composable
    get() = LocalColorsProvider.current

    var customTheme by mutableStateOf(CustomTheme.LIGHT)

    fun isSystemInDarkTheme():Boolean{
        return customTheme == CustomTheme.DARK
    }
}

@Composable
fun GeneralComposeTheme(
    customTheme: CustomTheme = CustomThemeManager.customTheme,
    content: @Composable () -> Unit
) {
    val (colorPalette, myColor) = customTheme.colors
    
    CustomLocalProvider(colors = myColor) {
        MaterialTheme(
            colors = colorPalette,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }


}