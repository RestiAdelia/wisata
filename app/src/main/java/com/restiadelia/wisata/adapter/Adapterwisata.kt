package com.restiadelia.wisata.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.restiadelia.wisata.Detailwisata
import com.restiadelia.wisata.R
import com.restiadelia.wisata.model.destination

class Adapterwisata(
    private val daftarWisata: List<destination>,
    private val context: Context
) : RecyclerView.Adapter<Adapterwisata.ViewHolder>() {

    // ViewHolder untuk menyimpan referensi ke tampilan item
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambarwisata: ImageView = itemView.findViewById(R.id.image) // Hanya gambar
    }

    // Inflate layout item (hanya menampilkan gambar)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    // Bind data ke tampilan item
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val wisata = daftarWisata[position]
        holder.gambarwisata.setImageResource(wisata.imageResId) // Atur gambar

        // Menambahkan click listener pada itemView
        holder.itemView.setOnClickListener {
            // Buat intent untuk membuka activity detail
            val intent = Intent(context, Detailwisata::class.java)

            // Mengirim data ke activity detail
            intent.putExtra("image", wisata.imageResId) // Mengirim image resource ID
            intent.putExtra("name", wisata.name) // Mengirim nama tempat
            intent.putExtra("description", wisata.descrip) // Mengirim deskripsi tempat

            // Mulai activity detail
            context.startActivity(intent)
        }
    }

    // Mengembalikan jumlah item
    override fun getItemCount(): Int {
        return daftarWisata.size
    }
}
