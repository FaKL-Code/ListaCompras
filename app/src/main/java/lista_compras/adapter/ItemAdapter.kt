package lista_compras.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import lista_compras.R
import listacomprasasold.model.Produto

// Classe responsável pela adaptação de uma lisra de dados para uma recycleView
class ItemAdapter(val dataset:List<Produto>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //Inner class responesável pela acesso via código aos componentes do layout de cada item
    class ItemViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvItemNome:TextView = view.findViewById(R.id.tvItemNome)
        val tvItemMarca:TextView = view.findViewById(R.id.tvItemMarca)
        val tvItemPreco:TextView = view.findViewById(R.id.tvItemPreco)
    }

    //função responsável pela criação de uma instância de ItemViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    //função responsável pela associação de um objeto de dados a uma instância de ItemViewHolder
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val produto = dataset[position]
        holder.tvItemNome.text = produto.nome
        holder.tvItemMarca.text = produto.marca
        holder.tvItemPreco.text = produto.preco.toString()
    }

    //função responsável por retornar o tamanho da lista de dados
    override fun getItemCount(): Int {
        return dataset.size
    }

}