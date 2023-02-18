package com.farzin.generalcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.farzin.generalcompose.composeNavugation.SetupNavGraph
import com.farzin.generalcompose.ui.theme.GeneralComposeTheme
import com.farzin.generalcompose.ui.theme.Shapes
import me.nikhilchaudhari.library.NeuInsets
import me.nikhilchaudhari.library.shapes.Pot
import me.nikhilchaudhari.library.shapes.Pressed
import me.nikhilchaudhari.library.shapes.Punched

class MainActivity : ComponentActivity() {

    lateinit var navController : NavHostController

    @OptIn(ExperimentalFoundationApi::class, ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

           GeneralComposeTheme {
               navController = rememberNavController()
               SetupNavGraph(navController = navController)
           }

            /*val scaffoldState = rememberScaffoldState()
            val coroutineScope = rememberCoroutineScope()
            val modalSheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)

            Scaffold(
                scaffoldState = scaffoldState,
                topBar = {

                    GeneralComposeTheme() {
                        MyAppBar()
                    }

                },

                bottomBar = {
                    GeneralComposeTheme() {
                        BottomAppBarView()
                    }

                },

                drawerContent = {
                    Text(text = "drawer")
                },

                floatingActionButton = {
                    FloatingActionButton(onClick = {

                        coroutineScope.launch {
                            scaffoldState.snackbarHostState
                                .showSnackbar("SnackBar")

                            modalSheetState.show()
                        }

                        Toast.makeText(this@MainActivity, "Toast", Toast.LENGTH_LONG).show()

                        startActivity(Intent(this@MainActivity, MapActivity::class.java))

                    }) {
                        Text(text = "+")
                    }
                },


                content = {

                    GeneralComposeTheme() {
                        Surface(modifier = Modifier.fillMaxSize()) {

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                                Button(
                                    onClick = {
                                        CustomThemeManager.customTheme =
                                            if (CustomThemeManager.customTheme == CustomTheme.DARK) {
                                                CustomTheme.LIGHT
                                            } else {
                                                CustomTheme.DARK
                                            }
                                    },
                                    colors = ButtonDefaults.buttonColors(
                                        backgroundColor = CustomThemeManager.colors.buttonBackGroundColors,
                                        contentColor = CustomThemeManager.colors.buttonTextColor
                                    )
                                )
                                {
                                    Text(text = "Change My Theme...")
                                }

                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "Current Theme is ${
                                        if (CustomThemeManager.isSystemInDarkTheme()) {
                                            "Dark"
                                        } else {
                                            "Light"
                                        }
                                    }"
                                )
                            }

                        }
                    }


                    *//*Surface(modifier = Modifier
                        .fillMaxSize()
                    ) {

                        ModalBottomSheetLayout(
                            sheetState = modalSheetState,
                            sheetContent = {
                                LazyColumn(
                                    modifier = Modifier
                                        .padding(bottom = 60.dp)
                                ) {

                                    items(count = 50) {
                                        WalletItem(name = "BitCoin$it")
                                    }
                                }
                            }) {

                        }


























//                        LazyColumn() {
//                            itemsIndexed(
//                                listOf("BitCoin", "Ether", "DodgCoin", "SHIBA", "Tron")
//                            ){index, item ->
//                                WalletItem(name = item)
//                            }
//                        }

//                        Column() {
//                            LazyVerticalGrid(modifier = Modifier
//                                .padding(16.dp),
//                                cells = GridCells.Adaptive(150.dp),
//                                contentPadding = PaddingValues(12.dp),
//                                content = {
//                                    items(450) {
//
//
//                                        CardViewShop(title = "title$it",
//                                            realPrice = "250$",
//                                            image = painterResource(id = R.drawable.bat))
//                                    }
//                                }
//                            )
//                        }


                    }*//*

                }
            )*/


        }


        /*Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .background(Color.LightGray),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,

            ) {

            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Black,
                            fontStyle = FontStyle.Italic,
                            fontSize = 35.sp
                        )
                    ) {
                        append("F")
                    }

                    append("arzin")



                    withStyle(
                        style = SpanStyle(
                            color = Color.Black,
                            fontStyle = FontStyle.Italic,
                            fontSize = 35.sp
                        )
                    ) {
                        append(" A")
                    }
                    append("llahyari")
                },
                color = Color(0xFF021E72),
                fontSize = 25.sp,
                fontFamily = FontFamily.Monospace,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold
            )
        }*/
    }
}


@Composable
fun ConstrainLayoutC() {
    val constraint = ConstraintSet {
        val greenBox = createRefFor(id = "green")
        val redBox = createRefFor(id = "red")
        val grayBox = createRefFor(id = "gray")
        val guideLine = createGuidelineFromTop(0.5f)




        constrain(greenBox) {
            top.linkTo(guideLine)
            bottom.linkTo(guideLine)
            width = Dimension.value(100.dp)
            height = Dimension.value(100.dp)
        }

        constrain(redBox) {
            top.linkTo(greenBox.top)
            start.linkTo(greenBox.end)
            width = Dimension.value(100.dp)
            height = Dimension.value(100.dp)
        }


        createHorizontalChain(greenBox, redBox,
            chainStyle = ChainStyle.Spread
        )


    }


    ConstraintLayout(constraint, modifier = Modifier
        .fillMaxSize()
    ) {

        Box(modifier = Modifier
            .background(Color.Red)
            .layoutId("red")
        )

        Box(modifier = Modifier
            .background(Color.Green)
            .layoutId("green")
        )


    }
}


@Composable
fun Loader() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.loading))
    LottieAnimation(
        composition = composition,
        iterations = LottieConstants.IterateForever
    )
}


var count = mutableStateOf(0)

@Composable
fun Counter() {
    var state by remember {
        count
    }

    Text(text = state.toString(),
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    )
}


@Composable
fun MyButton() {


    var state by remember { mutableStateOf(true) }

    Button(onClick = {

        state = !state

    })

    {
        Text(text = state.toString())
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GeneralComposeTheme {
        Surface(
            shape = CircleShape
        ) {
            InsertImg(painter = painterResource(id = R.drawable.bat),
                title = "",
                desc = "",
                price = "")
        }
    }
}