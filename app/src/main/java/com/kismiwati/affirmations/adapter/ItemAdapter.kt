package com.kismiwati.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kismiwati.affirmations.R
import com.kismiwati.affirmations.model.Affirmation

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */

//nama class nya adalah ItemAdapter
//adapter adalah class untuk menampung data untuk disesuaikan format tampilannya
//clas ItemAdapter merupakan turunan dari recyclerview, yang didalamnya terdapat ItemViewHolder

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // class ItemViewHolder merupakan sub class,
    //class ini digunakan untuk menampilkan data per Item
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        //class ini menyediakan teks dengan nama variabel TextView
        //item_title adalah sebauh pemanggilan dari tampilan layout
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    //onCreateViewHolder digunakan untuk menghubungkan item data ke layout.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    //onBindViewHolder digunakan untuk memasukkan masing masing data kesetiap item atau tampilan
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    //getItemCount digunakan untuk menghitung banyaknya data yang akan ditampilkan ditampilan.
    override fun getItemCount() = dataset.size
}