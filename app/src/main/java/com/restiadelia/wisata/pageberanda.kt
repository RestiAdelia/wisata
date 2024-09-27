package com.restiadelia.wisata

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.restiadelia.wisata.adapter.Adapterwisata
import com.restiadelia.wisata.model.MockList
import com.restiadelia.wisata.model.MockList1
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

        rv_wisata.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        rv_wisata1.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false)

        val adapter = Adapterwisata(MockList.getModel() as ArrayList<destination>, this)
        val adapterr = Adapterwisata(MockList1.getModel() as ArrayList<destination>, this)

        rv_wisata.adapter = adapter
        rv_wisata1.adapter =adapterr

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }




    }
