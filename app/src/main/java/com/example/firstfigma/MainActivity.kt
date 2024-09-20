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
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstfigma.ui.theme.FirstFigmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
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
            Column(
                modifier = Modifier.fillMaxHeight(0.5f),
                verticalArrangement = Arrangement.Bottom
            ) {
                Buttons(
                    modifier = Modifier.shadow(20.dp),
                    firstText = "أنشئ جلسة جديد",
                    color = ButtonColors(
                        contentColor = Color.Black,
                        containerColor = Color.Yellow,
                        disabledContainerColor = Color.Blue,
                        disabledContentColor = Color.Gray
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))
                Buttons(
                    firstText = "انضم إلى جلسة", color = ButtonColors(
                        contentColor = Color.Black,
                        containerColor = Color.White,
                        disabledContainerColor = Color.Blue,
                        disabledContentColor = Color.Gray
                    )
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
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(R.drawable.frame_823),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(R.drawable.potrace8_44_05_am_3),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        HorizontalDivider(
            thickness = 4.dp,
            color = Color.Red
        )
        Card(

        ) {
            Text(
                text = text,
                modifier = Modifier.padding(50.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
        }

    }

}

@Composable
fun Buttons(modifier: Modifier = Modifier, firstText: String, color: ButtonColors) {
    Button(modifier = Modifier.fillMaxWidth(),
        colors = color,
        border = BorderStroke(1.dp, Color.Black),
        shape = RoundedCornerShape(100),

        onClick = { /*TODO*/ }
    ) {
        Text(
            text = firstText,
            fontSize = 25.sp
        )
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

@Composable
@Preview
fun ddd() {
    Column {
        MyCustomItem(
            modifier = Modifier
                .width(100.dp)
                .background(Color.Red)
        )
        MyCustomItem(
            modifier = Modifier
                .width(200.dp)
        )
        MyCustomItem()
        MyCustomItem()
    }
}