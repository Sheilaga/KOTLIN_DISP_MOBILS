package com.example.v1_tasca3

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import coil.load
//importa la libreria coil para poder descargar la imagen desde internet

//RECIBE LOS DATOS(CON GETSTRINGEXTRA)
// Y LOS COLOCA EN TEXTVIEW Y LA IMAGEN
class FormularioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.manual_formulario)
        //nos dice a que xml corresponde esta pantalla

        //intent es desde nos han abierto el paso con startActivity(intent)
        //getStringExtra saca el dato que se guradó en la etiqueta
        val nombre = intent.getStringExtra("nombre")
        val correo = intent.getStringExtra("correo")
        val bio = intent.getStringExtra("bio")
        val imagen = intent.getStringExtra("imagen")

        //Busca el TextView con el id y le poene como texto el valor recibido
        findViewById<TextView>(R.id.tvNombre).text = nombre
        findViewById<TextView>(R.id.tvCorreo).text = correo
        findViewById<TextView>(R.id.tvBio).text = bio

        //Busca la ImageView y le dice a Coil que descargue la imagen de esa Url y la muestre
        findViewById<ImageView>(R.id.ivPerfil).load(imagen)
    }
}