package com.sinest.retrofitrxexample.presentation

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.sinest.retrofitrxexample.data.repository.LottoRepository
import io.reactivex.rxkotlin.addTo

class MainViewModel : BaseViewModel() {
    private val lottoRepository = LottoRepository()


    var numberList = MutableLiveData<List<Int?>>()

    @SuppressLint("CheckResult")
    fun getLotto(
        onSuccess: (result: List<Int?>) -> Unit,
        onFail: (t: Throwable) -> Unit
    ) {
        lottoRepository.getLotto(555).subscribe({ lotto ->
            var list = arrayOf(
                lotto.drwtNo1,
                lotto.drwtNo2,
                lotto.drwtNo3,
                lotto.drwtNo4,
                lotto.drwtNo5,
                lotto.drwtNo6
            ).toList()
            onSuccess(list)
        }, {
            Log.d("TEST",it.message)
            onFail(it)
        }).addTo(disposable)
    }
}