package com.example.contadorviews

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ManualComptador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.manual_comptador)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText = findViewById<EditText>(R.id.editTextNumber)
        val btnConfirmar = findViewById<Button>(R.id.btnConfirmar)
        val btnAnterior = findViewById<Button>(R.id.btnAnterior)

        //este lo sacamos del Main, para que deje de buguearse, viene con el putExtra
        //para concatenar y que siga saliendo el contador, se usa el $, pq es un editText y busca solo texto, no enteros
        intent.getIntExtra(COUNT_NUMBER,0).apply { editText.setText("$this")}

        // val comptador = intent.getIntExtra(COUNT_NUMBER,0).apply { editText.setText(this)}

        //editText.setText(comptador)

        btnAnterior.setOnClickListener {
            val pantallaAnterior = Intent(this, MainActivity::class.java)

            startActivity(pantallaAnterior)
        }
    }
}