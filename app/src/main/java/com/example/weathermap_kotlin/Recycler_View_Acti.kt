package com.example.weathermap_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Recycler_View_Acti : AppCompatActivity() {
    var  dummyName = ""
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

        val adapter = Recycler_Holder_Class(this, arrList, object : Recycler_Holder_Class.OnClickListener {
            override fun onClick(position: Int, item: RecyclerAdapterModel) {
                Toast.makeText(applicationContext,"Zohaib $position",Toast.LENGTH_SHORT).show()
                val intent = Intent(this@Recycler_View_Acti, Fetching_data_recyclerView::class.java)
                intent.putExtra("IMAGE_RESOURCE", item.img)
                intent.putExtra("NAME", item.name)
                intent.putExtra("PHONE_NUMBER", item.num)
                startActivity(intent)
            }
        })
        recyclerView.adapter = adapter

    }
}