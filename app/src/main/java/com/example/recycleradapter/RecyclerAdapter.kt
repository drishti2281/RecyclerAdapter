package com.example.recycleradapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(var recyclerClickInterface: RecyclerClickInterface) : RecyclerView.Adapter<RecyclerAdapter.ViewHolderClass>() {
    inner class ViewHolderClass(var view: View): RecyclerView.ViewHolder(view){
        var tvText = view.findViewById<TextView>(R.id.tvName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_adapter, parent, false)
        return ViewHolderClass(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        holder.tvText.setText("Text $position")
        holder.tvText.setOnClickListener {
            recyclerClickInterface.onItemClick()
        }
        //data set
        //click listener
    }

}