package com.example.contadorview_jca

import android.R.attr.onClick
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.contadorview_jca.ui.theme.ContadorView_JCATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContadorView_JCATheme {
              /*  Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    //Text("Pepe")
                    //Label("Hola")
                    //Label("Android")*/
                ClickerCard()
                }
            }
        }
    }

@Preview(showBackground = true)

@Composable
fun ClickerCard(){
    var counter by remember{mutableStateOf(0)}

    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
        Text("Counter: $counter")
        Button(onClick = { counter++ }) {
            Text("Click ME!")
        }

    }

}
/*
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
    ContadorView_JCATheme {
        Greeting("Android")
    }
}

@Composable
fun Label(text: String) {
Text("Pepe")
}

@Composable
fun crearBoton() {
    ContadorView_JCATheme {
        Button(onClick"Contador")
    }
}*/