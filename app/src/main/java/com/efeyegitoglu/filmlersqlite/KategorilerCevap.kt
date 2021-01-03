package com.efeyegitoglu.filmlersqlite

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class KategorilerCevap(
   @SerializedName("kategoriler")
   @Expose
   var kategori: List<Kategoriler>,
   @SerializedName("success")
   @Expose
   var success:Int
) {
}