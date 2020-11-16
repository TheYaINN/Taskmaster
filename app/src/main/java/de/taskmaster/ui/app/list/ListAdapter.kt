package de.taskmaster.ui.app.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.joachimsohn.R

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    //TODO("Add Datasource as object, that handles everything that has to do with the data")
    private lateinit var listView: CardView

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        listView = inflater.inflate(R.layout.list_item, parent, false) as CardView
        return ListViewHolder(listView)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind() //TODO: add missing object to be binded as param to method
    }

    override fun getItemCount(): Int {
        TODO()
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind() {}

    }

}
