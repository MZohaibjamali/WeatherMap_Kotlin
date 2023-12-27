package com.example.weathermap_kotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.weathermap_kotlin.databinding.ActivityBindingExerimentBinding

class BindingExeriment : AppCompatActivity() {

    private lateinit var binding: ActivityBindingExerimentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBindingExerimentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPanel.setOnClickListener {
            val intent = Intent(this@BindingExeriment, Recycler_View_Acti::class.java)
            startActivity(intent)
        }
    }

}
