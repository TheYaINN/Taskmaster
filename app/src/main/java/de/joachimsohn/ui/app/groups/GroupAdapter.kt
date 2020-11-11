package de.joachimsohn.ui.app.groups

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class GroupAdapter : RecyclerView.Adapter<GroupAdapter.GroupViewHolder>() {

    val data: List<Object> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}


