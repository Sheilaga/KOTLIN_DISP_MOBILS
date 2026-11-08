package Fase_2

import kotlin.Int


class Inventari {
   //creamos Array para guardar los productos
    private val productes: ArrayList<Producte> = arrayListOf()

    //creamos un contador para generar los ID automaticamente
    private var contadorId = 1


    fun afegir(nom: String,preu: Double,stock: Int, categoria: Categoria) {
        val nouProducte = Producte(contadorId, nom, preu, stock, categoria)
        productes.add(nouProducte)

        contadorId++
    }


    // Consultar toda la lista de productes
    fun consultar(): List<Producte> {
        return productes
    }


    // Actualizar stock
    fun actualitzarStock(id: Int, nouStock: Int) {

        for (product in productes) {
            if (product.id == id) {
                product.stock = nouStock

            }
        }
    }

    // Actualizar precio
    fun actualitzarPreu(id: Int, nouPreu: Double) {

        for (product in productes) {
            if (product.id == id) {
                product.preu = nouPreu

            }
        }
    }
}
