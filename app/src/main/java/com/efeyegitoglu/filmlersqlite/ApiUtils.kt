package com.info.retrofitkullanimi

import com.efeyegitoglu.filmlersqlite.FilmlerDaoInterface
import com.efeyegitoglu.filmlersqlite.KategorilerDaoInterface


class ApiUtils {

    companion object{

        val BASE_URL = "http://efeygt.ml/"

        fun getKategorilerDaoInterface(): KategorilerDaoInterface {
            return RetrofitClient.getClient(BASE_URL).create(KategorilerDaoInterface::class.java)
        }

        fun getFilmlerDaoInterface(): FilmlerDaoInterface {
            return RetrofitClient.getClient(BASE_URL).create(FilmlerDaoInterface::class.java)
        }
    }
}



