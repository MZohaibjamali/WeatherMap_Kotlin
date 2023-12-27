package com.example.weathermap_kotlin

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.weathermap_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.coolbtn.setOnClickListener {

            binding.linerLayoutMain.setBackgroundColor(Color.BLUE)
        }

        binding.hotBtn.setOnClickListener {

            binding.linerLayoutMain.setBackgroundColor(Color.GREEN)
            val intent = Intent(this@MainActivity , BindingExeriment::class.java)
            startActivity(intent)
        }
    }
}
