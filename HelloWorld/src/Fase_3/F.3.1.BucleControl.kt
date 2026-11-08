package Fase_3

import Fase_2.Categoria
import Fase_2.Inventari

class BucleControl {

    //creamos la funcion iniciar para que se inicie desde main
    fun iniciar() {

        //creamos e instanciamos terminal para conectarlo
        //creamos e instanciamos inventario para conectarlo
        val terminal = Terminal()
        val inventari = Inventari()


        while (true) {

            terminal.mostrarMenu()

            val opcio = terminal.escullOpcio()

            if (opcio ==1) {
                println("\n -----AFEGIR PRODUCTE-----")
                    val nom = terminal.llegirNom()
                    val preu = terminal.llegirPreu()
                    val stock = terminal.llegirStock()

                //Guardamos en el inventario
                //Ponemos categoria manual de momento
                inventari.afegir(nom, preu, stock, categoria = Categoria.BEGUDES)

                //pasamos los datos a Terminal para mostrar por pantalla
                terminal.mostrarAfegirProducte()

                }


            else if (opcio == 2){
                println("\n -----LLISTAT DE PRODUCTES-----")
                //creamos variable llista para acceder a la array de Producte
                   val llista = inventari.consultar()

                if(llista.isEmpty()) {
                    println("\nInventari buit ")
                }else{
                    //print directamente con for de la lista
                    for(product in llista){
                        println(product)
                        println("\n_________________________________")
                    }
                }
                }



            else if (opcio == 3){
                println("\n -----MODIFICAR STOCK-----")
                    val id = terminal.llegirId()
                    val nouStock = terminal.llegirStock()

                //va a inventari
                //busca en al array el id
                //le asigna el nuevo stock
                inventari.actualitzarStock(id, nouStock)

                //muestra el mensaje que hay en terminal
                terminal.mostrarActualitzarStock()
                }

            else if (opcio == 4){
                println("\n -----MODIFICAR PREU-----")
                val id = terminal.llegirId()
                val nouPreu = terminal.llegirPreu()

                inventari.actualitzarPreu(id, nouPreu )
                terminal.mostrarActualitzarPreu()
            }

            else if (opcio == 5) {
                println("Sortint de l'inventari...")
                break
            }

            else{
                    println("Aquesta es una opció no vàlida")
                }
            }
        }
}


