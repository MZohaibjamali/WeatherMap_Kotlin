package com.example.weathermap_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weathermap_kotlin.databinding.ActivityBindingExerimentBinding

class BindingExeriment : AppCompatActivity() {

    lateinit var binding:ActivityBindingExerimentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBindingExerimentBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_binding_exeriment)

        binding.buttonPanel.setOnClickListener {

        }
    }
}