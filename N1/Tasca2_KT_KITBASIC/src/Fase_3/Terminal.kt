package Fase_3

import java.util.Scanner

//la clase Terminal iran los Prints que se veran
//Es la GUI o la INTERFACE (lo que se ve)
//
class Terminal {

    //creamos la clase Scanner para pedir los datos
    val scanner = Scanner(System.`in`)

    //--------------MENU PRINCIPAL--------------------

    //creamos la función mostraMenu
    fun mostrarMenu(){
        println("_______MENU PRINCIPAL INVENTARI_______")
        println("1. Registrar Producte")
        println("2. Llistat Producte")
        println("3. Modificar Stock")
        println("4. Modificar Preu")
        println("5. Sortir de inventari")

        println("\nEscull una opció: ")

    }

    //creamos la funcion escullOpcion para que la pase por Scanner
    fun escullOpcio():Int {
        val opcio = scanner.nextInt()
        scanner.nextLine()
        return opcio
    }



// ----------------PEDIR DATOS SCANER---------------------

    fun llegirId(): Int{
        println("Ingresa l'ID del producte: ")
        return scanner.nextInt()
    }

    fun llegirNom():String{
    println("Ingresa el nom del producte: ")
    return scanner.nextLine()
}
    fun llegirPreu(): Double{
        println("Ingresa el preu amb una coma: ")
        return scanner.nextDouble()
    }

    fun llegirStock(): Int{
        println("Ingresa el stock: ")
        return scanner.nextInt()
    }





//-------------------PRINTS POR PANTALLA-------------

    fun mostrarAfegirProducte(){
        println("\nProducte afegit")
        println("\n_________________________________")
    }


    fun mostrarActualitzarStock(){
        println("\nStock actualitzat")
        println("\n_________________________________")
    }

    fun mostrarActualitzarPreu(){
        println("\nPreu actualitzat")
        println("\n_________________________________")
    }


}