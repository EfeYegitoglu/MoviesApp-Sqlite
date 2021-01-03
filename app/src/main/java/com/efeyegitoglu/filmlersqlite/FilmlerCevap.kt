package com.efeyegitoglu.filmlersqlite

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class FilmlerCevap(
    @SerializedName("filmler")
    @Expose
    var filmler: List<Filmler>
    ,
    @SerializedName("success")
    @Expose
    var success: Int
) {
}