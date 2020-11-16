package de.taskmaster.ui.app.group

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.joachimsohn.R

class GroupAdapter : RecyclerView.Adapter<GroupAdapter.GroupViewHolder>() {

    //TODO("Add Datasource as object, that handles everything that has to do with the data")
    private lateinit var listView: CardView

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        listView = inflater.inflate(R.layout.group_item, parent, false) as CardView
        return GroupViewHolder(listView)
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind() {

        }
    }
}


