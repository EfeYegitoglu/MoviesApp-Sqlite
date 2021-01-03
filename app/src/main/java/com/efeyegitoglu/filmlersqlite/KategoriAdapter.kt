package com.efeyegitoglu.filmlersqlite

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class KategoriAdapter(private val mContext: Context, private val kategoriList: List<Kategoriler>) :
    RecyclerView.Adapter<KategoriAdapter.KategoriTutucu>() {

    inner class KategoriTutucu(tasarim: View) : RecyclerView.ViewHolder(tasarim) {
        var kategoriCard: CardView
        var textKategori: TextView

        init {
            textKategori = tasarim.findViewById(R.id.textViewKategoriAd)
            kategoriCard = tasarim.findViewById(R.id.kategori_card)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategoriTutucu {
        val tasarim =
            LayoutInflater.from(mContext).inflate(R.layout.kategori_card_tasarim, parent, false)
        return KategoriTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return kategoriList.size
    }

    override fun onBindViewHolder(holder: KategoriTutucu, position: Int) {
        val kategori = kategoriList[position]

        holder.textKategori.text = kategori.kategori_ad

        holder.kategoriCard.setOnClickListener {
            val intent = Intent(mContext, FilmlerActivity::class.java)
            intent.putExtra("kategoriNesne", kategori)
            mContext.startActivity(intent)
        }
    }
}