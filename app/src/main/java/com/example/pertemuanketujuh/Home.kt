package com.example.pertemuanketujuh

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pertemuanketujuh.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding

    private lateinit var recyclerView: RecyclerView
    val datawisata = listOf<list_wisatavariabel>(
        list_wisatavariabel(
            namawst = "Curug Gomblang",
            alamatwst = "Desa Kalisalak, Kec. Kedung Banteng",
            hargawst = "Rp. 5.0000,00",
            jamwst = "08.00 - 17.00 WIB"
        ),
        list_wisatavariabel(
            namawst = "Curug Telu",
            alamatwst = "Desa Karangsalam, Kec Baturaden",
            hargawst = "Rp. 10.000,00",
            jamwst = "09.00 - 16.00 WIB"
        ),
        list_wisatavariabel(
            namawst = "Menara Teratai",
            alamatwst = "Jl.Bung Karno, Kedungwuluh, Kec Purwokerto Timur",
            hargawst = "Rp. 15.000,00",
            jamwst = "09.00 - 22.00 WIB"
        ),
        list_wisatavariabel(
            namawst = "Taman Balaikemambang",
            alamatwst = "Jl.Karang Kobar No. 9,Glempang ",
            hargawst = "Rp. 10.000,00",
            jamwst = "09.00 - 21.00 WIB"
        ),
        list_wisatavariabel(
            namawst = "Southgate Club",
            alamatwst = "Jl. Supardjo Rustamm, Kec. Sokaraja ",
            hargawst = "Rp. 500.000,00",
            jamwst = "21.00 - 03.00 WIB"
        ),
        list_wisatavariabel(
            namawst = "Bukit Teletubies",
            alamatwst = "Dusun 4 Karangnangka, Kec. Cilongok ",
            hargawst = "Rp. 10.000,00",
            jamwst = "08.00 - 16.00 WIB"
        ),
    )
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_home)

        binding.rvUser.setOnClickListener{
            startActivity(Intent(this, DetailWisata::class.java))
        }
        recyclerView = findViewById<RecyclerView>(R.id.rvUser)
        recyclerView.setHasFixedSize(true)


        ShowCardWisata()
    }
    private fun ShowCardWisata() {
        recyclerView.layoutManager = LinearLayoutManager (this)
        val adapter = List_MahasiswaAdapter(this, datawisata) {}
        recyclerView.adapter = adapter
    }

}