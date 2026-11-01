package com.example.contadorviews

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val COUNT_NUMBER =" COUNT NUMBER"
class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var btn10: Button /*(//Nuevo boton +10)*/
    lateinit var btnAnterior: Button /*(//Nuevo boton pantalla Anterior)*/
    lateinit var textView: TextView
    //private val listeners = arrayListOf<ListenersCustom>()
    //lateinit  crea la variable antes de cargarla

    var comptador = 0
    var text = "Comptador $comptador"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //lo de arriba es siempre igual para todos
        //inicia todas las vistas
        btn = findViewById(R.id.btnConfirmar)
        //añado el nuebo boton
        btn10 = findViewById(R.id.btn10)
        btnAnterior = findViewById(R.id.btnAnterior)
        textView = findViewById(R.id.textView)
        /*listeners.addAll(
            arrayListOf(
                LogComponentListener(btn),
                LogComponentListener(textView),
                ToastShowListener(textView, "listener aplicado")
            )
        )*/

        textView.text = text

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn.setOnClickListener {
            comptador++
            //el contador no se va a actualiazar por si solo ya que es un error
            //hay que volverlo a poner
            upDateTextView()
        }

        btn10.setOnClickListener {
            comptador += 10
            //el contador no se va a actualiazar por si solo ya que es un error
            //hay que volverlo a poner
            upDateTextView()
        }
    }

        fun upDateTextView(){
            text = "Comptador $comptador"
            textView.text = text
        }


    }

