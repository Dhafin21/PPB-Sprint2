package com.example.pertemuanketujuh

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class List_MahasiswaAdapter (private val context: Context, private val dataList: List<list_wisatavariabel>, val listener: (list_wisatavariabel) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.list_wisata, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val myHolder = holder as MyViewHolder
        myHolder.bindView(dataList[position], listener)
    }
    inner class MyViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val cardView =
            itemView.findViewById<CardView>(R.id.cardView)
        val namawst =
            itemView.findViewById<TextView>(R.id.txtNamaWisata)
        val alamatwst =
            itemView.findViewById<TextView>(R.id.txtAlamat)
        val hargawst =
            itemView.findViewById<TextView>(R.id.txtHarga)
        val jamwst =
            itemView.findViewById<TextView>(R.id.txtJamOprasional)
        fun bindView(mhs: list_wisatavariabel, listener: (list_wisatavariabel) -> Unit) {
            cardView.setOnClickListener {
                listener(mhs)
                val intent = Intent(context, Detail::class.java)
                intent.putExtra("nama_mhs", mhs.namawst)
                intent.putExtra("nim_mhs", mhs.alamatwst)
                intent.putExtra("telp_mhs", mhs.hargawst)
                intent.putExtra("jam_wst",mhs.jamwst)
                context.startActivity(intent)
            }
            namawst.text = mhs.namawst
            alamatwst.text = mhs.alamatwst
            hargawst.text = mhs.hargawst
            jamwst.text = mhs.jamwst
        }
    }

}