package com.efeyegitoglu.filmlersqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detay.*

class DetayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        val film = intent.getSerializableExtra("filmDetay") as Filmler

        imageViewResim.setImageResource(
            resources.getIdentifier(
                film.film_resim,
                "drawable",
                packageName
            )
        )

        textViewDetayAd.text = film.film_ad
        textViewDetayYil.text = film.film_yil.toString()
        textViewDetayYonetmen.text = film.yonetmen.yonetmen_adi
    }
}
