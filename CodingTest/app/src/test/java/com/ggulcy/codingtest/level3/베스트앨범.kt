package com.ggulcy.codingtest.level3

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 베스트앨범 {
    @Test
    fun main() {
        var genres = arrayOf("classic","pop","classic","classic","pop")
        var plays = IntArray(5)

        var playArr = arrayOf(500,600,800,800,2500) //pop 3100 classic 2100 4 1
        for (i in plays.indices) plays[i] = playArr[i]


//
//        var list = mutableListOf<Song>().apply {
//            genres.zip(plays.toList()).forEachIndexed { i, p ->
//               add(Song(i,p.first,p.second))
//            }
//        }
//
//        var sorted = hashMapOf<String,Int>().apply {
//            list.forEach {
//                if (this[it.genre] == null) this[it.genre] = it.play
//                else this[it.genre] = this[it.genre]!!.plus(it.play)
//            }
//        }.toList().sortedBy { it.second }.reversed().toMap().keys
//
//        var answer = mutableListOf<Int>().apply {
//            sorted.forEach { sorted ->
//                list.filter {
//                    it.genre == sorted
//                }.sortedByDescending { it.play }.take(2).forEach { add(it.idx) }
//
//            }
//        }

    }


    data class Song(var idx:Int, var genre:String , var play:Int)
}
