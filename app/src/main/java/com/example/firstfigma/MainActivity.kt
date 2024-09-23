package com.example.firstfigma

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstfigma.ui.theme.FirstFigmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CompositionLocalProvider(
                LocalLayoutDirection provides LayoutDirection.Rtl
            )
            {
                FirstFigmaTheme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        Jalsa(
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }

            }
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Jalsa(modifier: Modifier = Modifier) {
        FirstFigmaTheme {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MainView(stringResource(R.string.MainSentence))
                Spacer(modifier = Modifier.height(150.dp))
                Column(
                    modifier = Modifier.fillMaxHeight(0.5f),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Buttons(
                        modifier = Modifier.shadow(20.dp),
                        firstText = "أنشئ جلسة جديد",
                        color = colorResource(R.color.Asfar)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Buttons(
                        firstText = "انضم إلى جلسة", color = Color.White
                    )
                }
            }
        }

    }

    @Composable
    fun MainView(
        text: String,
        modifier: Modifier = Modifier
    ) {
        Column(
            modifier = modifier.fillMaxWidth()
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(35.dp),
                painter = painterResource(R.drawable.potrace8_44_05_am_3),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                text = text,
                modifier = Modifier.padding(horizontal = 50.dp),
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                lineHeight = 26.24.sp,
                fontFamily = FontFamily(Font(R.font.cairomedium)),
                color = colorResource(R.color.assouad1)
            )

        }

    }

    @Composable
    fun Buttons(modifier: Modifier = Modifier, firstText: String, color: Color) {
        Box {
            Card(
                modifier = Modifier.padding(5.dp)
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(vertical = 5.dp, horizontal = 30.dp),
                border = BorderStroke(2.dp, color = Color.Black),
                colors = CardColors(
                    containerColor = Color.Black,
                    contentColor = Color.White,
                    disabledContainerColor = Color.Red,
                    disabledContentColor = Color.Red
                )
            ) { }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(vertical = 5.dp, horizontal = 30.dp),
                border = BorderStroke(2.dp, color = Color.Black),
                colors = CardColors(
                    containerColor = color,
                    contentColor = Color.White,
                    disabledContainerColor = Color.Red,
                    disabledContentColor = Color.Red
                )


            ) {
                Text(
                    text = firstText,
                    fontSize = 16.sp,
                    lineHeight = 29.98.sp,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 7.dp),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily(Font(R.font.cairobold)),
                    color = colorResource(R.color.assouad1)
                )
            }

        }
    }

    @Composable
    fun MyCustomItem(
        modifier: Modifier = Modifier
    ) {
        Row(
            modifier = modifier
        ) {
            Text("Hi")

            Spacer(
                Modifier.weight(1f)
            )

            Text("end")
        }
    }

}