package com.example.weathermap_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Recycler_Holder_Class(
    val context: Context,
    val arrContacts: ArrayList<RecyclerAdapterModel>,
    private val onClickListener: OnClickListener? = null
) : RecyclerView.Adapter<Recycler_Holder_Class.ViewHolder>() {

    interface OnClickListener {
        fun onClick(position: Int, item: RecyclerAdapterModel)
    }

    class ViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {
        val imageView: ImageView = itemView.findViewById(R.id.myImage)
        val textName: TextView = itemView.findViewById(R.id.textName)
        val textNumber: TextView = itemView.findViewById(R.id.textNumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(context).inflate(R.layout.recyclerdesigner, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return arrContacts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = arrContacts[position]

        holder.imageView.setImageResource(item.img)
        holder.textName.text = item.name
        holder.textNumber.text = item.num

        holder.itemView.setOnClickListener {
            onClickListener?.onClick(position, item)
        }
    }
}
