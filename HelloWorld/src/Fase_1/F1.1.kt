package Fase_1

//en kotlin va por funciones (fun)
fun main(){

    //llamamos a la funcion nom1 y le pasamos "sheila" y null
    nom1 ("Sheila")
    nom1 ("")
    nom1 (null)

}

// Creamos la función nom1.
//entre () ponemos los datos que hay que pasarle
// "nombre" es el parámetro que recibirá el valor que le pasemos.
// String? significa que puede recibir un texto o también null.
fun nom1 (nombre:String?){
    // Comprobamos si nombre es null O si está vacío
    if (nombre == null || nombre.isEmpty()) {
        // Si es cierto, mostramos este mensaje
        println("Sin texto")
    }else{
        // Si nombre tiene texto, guardamos ese texto en la variable resultado.
        // ?: significa: si nombre es null, utilizamos "Sin texto".
        val resutado = nombre ?: "Sin texto"
        // Mostramos el contenido de resultado por pantalla
        println(resutado)
        }
}