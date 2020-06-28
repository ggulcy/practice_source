package com.sinest.retrofitrxexample.data.factory

import com.sinest.retrofitrxexample.data.response.LottoResopnse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface LottoApi{
    @GET("common.do?method=getLottoNumber")
    fun getLotto(
        @Query("drwNo") drwNo:Int
    ):Single<LottoResopnse>
}