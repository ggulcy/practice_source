package com.sinest.retrofitrxexample.data.repository

import com.sinest.retrofitrxexample.data.factory.ApiModule
import com.sinest.retrofitrxexample.data.response.LottoResopnse
import com.sinest.retrofitrxexample.domain.Lotto
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class LottoRepository {
    fun getLotto(drwNo : Int): Single<Lotto> {
        return ApiModule.provideLottoApi().getLotto(drwNo)
            .subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .map {
            Lotto(
                totSellamnt = it.totSellamnt,
                drw = it.drw,
                drwNoDateval = it.drwNoDateval,
                firstWinamnt = it.firstWinamnt,
                firstPrzwnerCo = it.firstPrzwnerCo,
                firstAccumamnt = it.firstAccumamnt,
                drwtNo1 = it.drwtNo1,
                drwtNo2 = it.drwtNo2,
                drwtNo3 = it.drwtNo3,
                drwtNo4 = it.drwtNo4,
                drwtNo5 = it.drwtNo5,
                drwtNo6 = it.drwtNo6,
                bnusNo = it.bnusNo
            )
        }
    }
}
