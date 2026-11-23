package com.example.myprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
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
import com.example.myprofile.ui.theme.MyProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyProfileTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Label(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Label(modifier: Modifier) {
    var name by remember{ mutableStateOf("") }
    var lastName by remember{ mutableStateOf("") }
    var biografy by remember{ mutableStateOf("") }
    var email by remember{ mutableStateOf("") }
    var url by remember{ mutableStateOf("") }

    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
        Text("$name")
        Text("$lastName")
        Text("$biografy")
        Text("$email")
        Text("$url")

        OutlinedTextField(
            value = name,
            onValueChange = {},
            label = { Text("Nombre") }
        )
        OutlinedTextField(
            value = lastName,
            onValueChange = {},
            label = { Text("Apellido") }
        )
        OutlinedTextField(
            value = biografy,
            onValueChange = {},
            label = { Text("Biografia") }
        )
        OutlinedTextField(
            value = email,
            onValueChange = {},
            label = { Text("Email") }
        )
        OutlinedTextField(
            value = url,
            onValueChange = {},
            label = { Text("URL") }
        )
    }
}

