package com.example.weathermap_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Recycler_View_Acti : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val arrList = ArrayList<RecyclerAdapterModel>()
     //   arrList.add(RecyclerAdapterModel(R.drawable.my, "Zohaib", "03491974302"))


        for (i in 1..51) {
            val dummyImageResource = R.drawable.my
            val dummyName = "Zohaib $i"
            val dummyPhoneNumber = "0349197430${i.toString().padStart(2, '0')}"

            arrList.add(RecyclerAdapterModel(dummyImageResource, dummyName, dummyPhoneNumber))
        }

        val recyclerView: RecyclerView = findViewById(R.id.recylerActivityClass)
        val gridLayout = GridLayoutManager(this, 3)
        recyclerView.layoutManager = gridLayout

        val recyclerAdapter = Recycler_Holder_Class(this, arrList)
        recyclerView.adapter = recyclerAdapter
    }
}