package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .safeDrawingPadding(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonadeScreen()
                }
            }
        }
    }
}

@Composable
fun LemonadeScreen(modifier: Modifier = Modifier) {
    var step by remember { mutableIntStateOf(1) }
    val painter = when (step) {
        1 -> painterResource(R.drawable.lemon_tree)
        2 -> painterResource(R.drawable.lemon_squeeze)
        3 -> painterResource(R.drawable.lemon_drink)
        else -> painterResource(R.drawable.lemon_restart)
    }
    val description = when (step) {
        1 -> stringResource(R.string.step_1_content_description)
        2 -> stringResource(R.string.step_2_content_description)
        3 -> stringResource(R.string.step_3_content_description)
        else -> stringResource(R.string.step_4_content_description)
    }
    val action = when (step) {
        1 -> stringResource(R.string.action_1)
        2 -> stringResource(R.string.action_2)
        3 -> stringResource(R.string.action_3)
        else -> stringResource(R.string.action_4)
    }
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFf9e44c)),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Lemonade",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(top = 12.dp, bottom = 12.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var counter by remember { mutableIntStateOf(0) }
            var targetNumberOfTaps by remember { mutableIntStateOf(0) }
            Button(
                modifier = Modifier.size(width = 230.dp, height = 220.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),
                onClick = {
                    when (step) {
                        1, 3 -> step++

                        2 -> {
                            when (counter) {
                                0 -> {
                                    targetNumberOfTaps = (2..4).random()
                                    counter++
                                }

                                in (1..<targetNumberOfTaps) -> counter++
                                else -> {
                                    counter = 0
                                    targetNumberOfTaps = 0
                                    step++
                                }
                            }
                        }

                        4 -> step = 1
                    }
                })
            {
                Image(
                    painter = painter,
                    contentDescription = description,
                    modifier = Modifier
                        .border(
                            width = 4.dp,
                            color = Color.LightGray,
                            shape = RoundedCornerShape(40.dp)
                        )
                )
            }
            Text(
                text = action,
                fontSize = 32.sp,
                lineHeight = 36.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LemonadeScreenPreview() {
    LemonadeTheme {
        LemonadeScreen()
    }
}
