package com.example.assigment0

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.assigment0.ui.theme.Assigment0Theme
import androidx.compose.material3.Button


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val total = 0

        setContent {
            Assigment0Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DecisionScreen(
                        onOk = {},
                        onMeh = {},
                        onNo = {},
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GenerateValue() {

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

fun DecisionScreen (
    onOk: (String) -> Unit,
    onMeh: (String) -> Unit,
    onNo: (String) -> Unit,
    modifier: Modifier = Modifier
) {


    Button(
        onClick = {
            if (newCityName.isNotBlank()) {
                onAddCity(newCityName)
                newCityName = ""
            }
        }
    ) {
        Text("Add City")
    }
}