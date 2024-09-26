package com.restiadelia.wisata

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.restiadelia.wisata.adapter.Adapterwisata
import com.restiadelia.wisata.model.MockList
import com.restiadelia.wisata.model.destination

class pageberanda : AppCompatActivity() {
    private lateinit var rv_wisata :RecyclerView
    private lateinit var rv_wisata1 :RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pageberanda)
        rv_wisata = findViewById(R.id.rv_wisata)
        rv_wisata1 = findViewById(R.id.rv_wisata1)

        layoutManager =LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)

        val adapter = Adapterwisata(MockList.getModel() as ArrayList<destination>,this)
        rv_wisata.adapter = adapter

        // Mengambil data dari Intent
        val detailtext = intent.getStringExtra("name") ?: "Default Name"
        val detailgambar = intent.getIntExtra("imageResId", 0)
        val detaildescripsi = intent.getStringExtra("descrp") ?: "Default Description"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }




    }
