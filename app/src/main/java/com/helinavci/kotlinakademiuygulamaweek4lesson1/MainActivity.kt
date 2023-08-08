package com.helinavci.kotlinakademiuygulamaweek4lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.helinavci.kotlinakademiuygulamaweek4lesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)
        tasarim.hamburger.setOnClickListener {
              val newIntent = Intent(this@MainActivity , detailPage :: class.java)
              newIntent.putExtra("ürün" , "humburger")
              startActivity(newIntent)
        }
        tasarim.kabak.setOnClickListener {
            val newIntent = Intent(this@MainActivity , detailPage :: class.java)
            newIntent.putExtra("ürün" , "kabak")
            startActivity(newIntent)
        }
        tasarim.kofte.setOnClickListener {
            val newIntent = Intent(this@MainActivity , detailPage :: class.java)
            newIntent.putExtra("ürün" , "kofte")
            startActivity(newIntent)
        }


    }



}
