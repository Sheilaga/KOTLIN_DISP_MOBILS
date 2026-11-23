package Fase_2
/* ------------------MAIN DE PROVA PARA EX. 2-----------------------------------
fun main() {

    //primero creamos un inventario nuevo para que coja los parametros de Inventari
    //lo instanciamos
    val inventari =Inventari()

    //creamos un producto nuevo ara que coja los parametros de Producte
    val product = Producte(
        1,
        "Cola",
        10.0,
        5,
        Categoria.BEGUDES
    )

    //registramos el producto en el inventario
    inventari.afegir(product)

    //consultamos y vemos la lista
    println(inventari.consultar())

    //actualizar stock
    println(inventari.actualitzarStock(1, 10))

    //actualizar stock
    println(inventari.actualitzarPreu(1, 20.25))

    //consultamos y vemos la lista
    println(inventari.consultar())
}

*/