package com.sinest.retrofitrxexample.data.response

import com.google.gson.annotations.SerializedName
import com.sinest.retrofitrxexample.domain.Lotto


class LottoResopnse {
    @SerializedName("totSellamnt")
    var totSellamnt: Long? = null

    @SerializedName("drw")
    var drw: Int? = null

    @SerializedName("drwNoDateval")
    var drwNoDateval: String? = null

    @SerializedName("firstWinamnt")
    var firstWinamnt: Long? = null

    @SerializedName("firstPrzwnerCo")
    var firstPrzwnerCo: Long? = null

    @SerializedName("firstAccumamnt")
    var firstAccumamnt: Long? = null

    @SerializedName("drwtNo1")
    var drwtNo1: Int? = null

    @SerializedName("drwtNo2")
    var drwtNo2: Int? = null

    @SerializedName("drwtNo3")
    var drwtNo3: Int? = null

    @SerializedName("drwtNo4")
    var drwtNo4: Int? = null

    @SerializedName("drwtNo5")
    var drwtNo5: Int? = null

    @SerializedName("drwtNo6")
    var drwtNo6: Int? = null

    @SerializedName("bnusNo")
    var bnusNo: Int? = null
}