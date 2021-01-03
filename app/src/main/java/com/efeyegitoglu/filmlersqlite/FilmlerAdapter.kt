package com.efeyegitoglu.filmlersqlite

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class FilmlerAdapter(private val mContext: Context, private val filmlerList: List<Filmler>) :
    RecyclerView.Adapter<FilmlerAdapter.FilmTutucu>() {

    inner class FilmTutucu(tasarim: View) : RecyclerView.ViewHolder(tasarim) {

        var filmCard: CardView
        var filmResim: ImageView
        var filmAd: TextView

        init {
            filmCard = tasarim.findViewById(R.id.filmCard)
            filmResim = tasarim.findViewById(R.id.filmimageView)
            filmAd = tasarim.findViewById(R.id.textViewFilmAd)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmTutucu {
        val tasarim =
            LayoutInflater.from(mContext).inflate(R.layout.film_card_tasarim, parent, false)
        return FilmTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return filmlerList.size
    }

    override fun onBindViewHolder(holder: FilmTutucu, position: Int) {
        val film = filmlerList[position]

        holder.filmAd.text = film.film_ad

        holder.filmResim.setImageResource(
            mContext.resources.getIdentifier(
                film.film_resim,
                "drawable",
                mContext.packageName
            )
        )

        holder.filmCard.setOnClickListener {
            val intent=Intent(mContext,DetayActivity::class.java)
            intent.putExtra("filmDetay",film)
            mContext.startActivity(intent)
        }

    }
}