package com.efeyegitoglu.filmlersqlite

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Yonetmenler(
    @SerializedName("yonetmen_id")
    @Expose
    var yonetmen_id: Int,
    @SerializedName("yonetmen_ad")
    @Expose
    var yonetmen_adi: String
) : Serializable {
}