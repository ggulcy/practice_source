package com.sinest.retrofitrxexample.domain


data class Lotto(
    var totSellamnt: Long?,
    var drw: Int?,
    var drwNoDateval: String?,
    var firstWinamnt:Long?,
    var firstPrzwnerCo:Long?,
    var firstAccumamnt:Long?,
    var drwtNo1: Int?,
    var drwtNo2: Int?,
    var drwtNo3: Int?,
    var drwtNo4: Int?,
    var drwtNo5: Int?,
    var drwtNo6: Int?,
    var bnusNo: Int?

//    returnValue : json 결과값 (success 또는 fail)
//totSellamnt : 누적 상금
//drwNo : 로또회차
//drwNoDate : 로또당첨일시
//firstWinamnt : 1등 당첨금
//firstPrzwnerCo : 1등 당첨 인원
//firstAccumamnt : 1등 당첨금 총액
//drwtNo1 : 로또번호1
//drwtNo2 : 로또번호2
//drwtNo3 : 로또번호3
//drwtNo4 : 로또번호4
//drwtNo5 : 로또번호5
//drwtNo6 : 로또번호6
//bnusNo  : 보너스번호
)