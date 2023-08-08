package com.helinavci.kotlinakademiuygulamaweek4lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class detailPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val intent = intent
        val urun = intent.getStringExtra("ürün")
        val imageView = ImageView(this)
        // setting height and width of imageview
        imageView.layoutParams= ConstraintLayout.LayoutParams(400, 400)
        imageView.x= 20F
        imageView.y= 20F

        if(urun.equals("hamburger"))
            imageView.setImageResource(R.drawable.hamburger)
        if(urun.equals("kabak"))
            imageView.setImageResource(R.drawable.kabak)
        if(urun.equals("hamburger"))
            imageView.setImageResource(R.drawable.kofte)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)


    }
}