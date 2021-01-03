package com.efeyegitoglu.filmlersqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.info.retrofitkullanimi.ApiUtils
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {


    private lateinit var adapter: KategoriAdapter
    private lateinit var kdi: KategorilerDaoInterface


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        toolbar.title = "Kategoriler"
        setSupportActionBar(toolbar)

        kategoriRv.setHasFixedSize(true)
        kategoriRv.layoutManager = LinearLayoutManager(this)

        kdi = ApiUtils.getKategorilerDaoInterface()

        tumKategoriler()


    }


    fun tumKategoriler(){

       kdi.tumKategoriler().enqueue(object :Callback<KategorilerCevap>{
           override fun onResponse(
               call: Call<KategorilerCevap>?,
               response: Response<KategorilerCevap>?
           ) {
               if (response!=null){
                   val list= response.body()!!.kategori
                   adapter = KategoriAdapter(this@MainActivity, list)
                   kategoriRv.adapter = adapter

               }


           }

           override fun onFailure(call: Call<KategorilerCevap>, t: Throwable) {

           }
       })
    }

}
