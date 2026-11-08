package com.example.v1_tasca3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

//RECOGE LO ESCRITO EN EL INTENT(putExtra)
// Y LO ENVIA A LA SEGUNDA PANTALLA(startActivity(intent)

//variable CONSTANTE
const val EXTRA_NOMBRE = "nombre"
const val EXTRA_CORREO = "correo"
const val EXTRA_BIO = "bio"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Busca por id y lo guarda en la variable
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val etBio = findViewById<EditText>(R.id.etBio)
        val etImagen = findViewById<EditText>(R.id.etImagen)


        val btnGuardar = findViewById<Button>(R.id.btnGuardar)

        //cuando se pulse este boton ejecuta lo que hay entre las llaves
        btnGuardar.setOnClickListener {
            //osea crea el Intent y enviamos los datos desde aqui a FormulaioActivity
            val intent = Intent(this, FormularioActivity::class.java)

            //Recoge lo escrito y lo guarda en el Intent (putExtra)
            //Usamos la variable CONSTANTE
            intent.putExtra(EXTRA_NOMBRE, etNombre.text.toString())
            intent.putExtra(EXTRA_CORREO, etCorreo.text.toString())
            intent.putExtra(EXTRA_BIO, etBio.text.toString())
            intent.putExtra("imagen", etImagen.text.toString())

            //Abre la pantalla FormularioAvtivity y envia los datos
            startActivity(intent)
        }
    }
}