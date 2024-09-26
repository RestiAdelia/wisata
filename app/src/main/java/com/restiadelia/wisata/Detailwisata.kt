package com.restiadelia.wisata

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detailwisata : AppCompatActivity() {
    private lateinit var image: ImageView
    private lateinit var Name: TextView
    private lateinit var descrip: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailwisata)

        image = findViewById(R.id.image)
        Name = findViewById(R.id.Name)
        descrip= findViewById(R.id.descrip)

        // Mengambil data dari Intent
        val detailName = intent.getStringExtra("name")
        val detailImageResId = intent.getIntExtra("imageResId", 0)
        val detailDescription = intent.getStringExtra("description")

        // Menampilkan data ke UI
        Name.text = detailName
        image.setImageResource(detailImageResId)
       descrip.text = detailDescription


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}