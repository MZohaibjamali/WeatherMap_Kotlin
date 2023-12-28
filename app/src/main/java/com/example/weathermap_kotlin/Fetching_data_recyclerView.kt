package com.example.weathermap_kotlin

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Fetching_data_recyclerView : AppCompatActivity() {

    lateinit var textPhoneNumber: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fetching_data_recycler_view)

        val imageResource = intent.getIntExtra("IMAGE_RESOURCE", R.drawable.my)
        val name = intent.getStringExtra("NAME") ?: ("Name: " + "")
        val phoneNumber = intent.getStringExtra("PHONE_NUMBER") ?: ""

        // Now you can use these values as needed in your destination activity
        val imageView: ImageView = findViewById(R.id.tvImage)
        val textName: TextView = findViewById(R.id.tvName);
        textPhoneNumber =findViewById(R.id.tvEmail)

        imageView.setImageResource(imageResource)
        textName.text = name
        textPhoneNumber.text = phoneNumber    }
}