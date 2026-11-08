package Fase_1

fun main(){

    //puedes poner lo que quieres ver por pantalla y luego llamar a la funcion
    //Kotlin lo entenderá
    println( calculDescompte(100.0,10.0))
    println( calculDescompte(200.0,20.0))
}

//creamos fun para calcular descompte
//entre() parametros que recibirá (preu yPercentatge) y que tipo de dato devolvera (Double)
fun calculDescompte (preu: Double, percentatge: Double): Double {
    val descompte = preu - (preu*(percentatge / 100))
    return descompte

}