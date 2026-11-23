package Fase_2

class Producte (
     val id: Int,
     var nom: String,
     var preu: Double,
     var stock: Int,
     val categoria: Categoria,

){

     //con override cambiamos una funcion ya existente
     //con la funcion toString creamos como queremos que se vea
     //:String lo convertirá en texto
     override fun toString(): String {
          return "ID: $id\nNom: $nom\nPreu: $preu\nStock: $stock\nCategoria: $categoria"
     }
}
