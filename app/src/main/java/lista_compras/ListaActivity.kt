package lista_compras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import lista_compras.adapter.ItemAdapter
import listacomprasasold.model.Produto
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity : AppCompatActivity() {


    //todo explicar sobre outros estágios do ciclo de vida
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val rvProdutos:RecyclerView = findViewById(R.id.rvProdutos)
        val fabProduto:FloatingActionButton = findViewById(R.id.fabProduto)
        fabProduto.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        Log.i("DADOS",Database.listaCompras.toString())

        rvProdutos.layoutManager = LinearLayoutManager(this)
        rvProdutos.adapter = ItemAdapter(Database.listaCompras)
    }
}