package com.example.assigment0

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.assigment0.ui.theme.Assigment0Theme
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Assigment0Theme {
                DecisionScreen()
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
fun GreetingPreview() {
    Assigment0Theme {
        Greeting("Android")
    }
}

@Composable
fun DecisionScreen() {
    var displayText by remember { mutableStateOf("") }
    var buttonClickedCount by remember { mutableStateOf(0) }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Student ID number: 1852182 and CCID: gmikhaie")
        Spacer(modifier = Modifier.height(16.dp))


        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                onClick = {
                    val random = Math.random()
                    if (random < 0.5) {
                        displayText = "Yes"
                    } else {
                        displayText = "No"
                    }
                    ++buttonClickedCount
                }
            ) {
                Text("Ok")
            }

            Button(
                onClick = {
                    val random = Math.random()
                    if (random < 0.25) {
                        displayText = "Yes"
                    } else {
                        displayText = "No"
                    }
                    ++buttonClickedCount
                }
            ) {
                Text("Meh")
            }

            Button(
                onClick = {
                    val random = Math.random()
                    if (random < 0.1) {
                        displayText = "Yes"
                    } else {
                        displayText = "No"
                    }
                    ++buttonClickedCount
                }
            ) {
                Text("Nah")
            }

            Spacer(modifier = Modifier.height(16.dp))
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Total clicks: $buttonClickedCount")

        Spacer(modifier = Modifier.height(16.dp))

        if (displayText.isNotEmpty()) {
            Text(text = displayText)
        }
    }
}