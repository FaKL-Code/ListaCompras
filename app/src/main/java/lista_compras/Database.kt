package lista_compras

import listacomprasasold.model.Produto

class Database {

    companion object{
        val listaCompras = mutableListOf<Produto>()
    }
}