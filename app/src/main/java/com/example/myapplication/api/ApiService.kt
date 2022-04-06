package com.example.myapplication.api
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call
import com.example.myapplication.model.ImageResultData

interface ApiService{
    @GET("images/search")
    fun searchImages(
        @Query("limit") limit: Int,
        @Query("size") format: String
    ): Call<List<ImageResultData>>
}