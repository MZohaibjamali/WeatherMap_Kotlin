package com.example.weathermap_kotlin

import android.content.Context
import android.provider.ContactsContract.Contacts
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class Recycler_Holder_Class (val context: Context , val arrContacts: ArrayList<RecyclerAdapterModel>): RecyclerView.Adapter<Recycler_Holder_Class.ViewHolder>(){
    class ViewHolder(viewItem : View) : RecyclerView.ViewHolder(viewItem) {
        val imageView = itemView.requireViewById<ImageView>(R.id.myImage)
        val  textName = itemView.requireViewById<TextView>(R.id.textName)
        val textNumber = itemView.requireViewById<TextView>(R.id.textNumber)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

       return  ViewHolder(LayoutInflater.from(context).inflate(R.layout.recyclerdesigner , parent , false))
    }

    override fun getItemCount(): Int {
       return arrContacts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(arrContacts[position].img)
        holder.textName.setText(arrContacts[position].name)
        holder.textNumber.setText(arrContacts[position].num)
    }

}