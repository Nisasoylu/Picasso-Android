package com.example.picassokullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button1.setOnClickListener {
            val url ="http://kasimadalan.pe.hu/yemekler/resimler/pizza.png"
            Picasso.get().load(url)
                .resize(400,400)
                .into(imageViewResim)

        }
        button2.setOnClickListener {
            val url = "http://kasimadalan.pe.hu/yemekler/resimler/tiramisu.png"
            Picasso.get().load(url)
                .placeholder(R.drawable.resim1)
                .error(R.drawable.resim2)
                .into(imageViewResim)
        }

        button3.setOnClickListener {
            val resimAdi = editTextGirdi.text.toString()

            val url ="http://kasimadalan.pe.hu/yemekler/resimler/$resimAdi"
            Picasso.get().load(url).into(imageViewResim)
        }
    }
}