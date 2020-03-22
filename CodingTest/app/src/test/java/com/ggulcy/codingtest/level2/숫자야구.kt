package com.ggulcy.codingtest.level2

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 숫자야구 {
    @Test
    fun main() {

        //[[123, 1, 1], [356, 1, 0], [327, 2, 0], [489, 0, 1]
        var baseball = arrayOf(
            arrayOf(123,1,1),
            arrayOf(356,1,0),
            arrayOf(327,2,0),
            arrayOf(489,0,1))

        var cnt = 0
        var answer = 0

        for(i in 100..999){
            if(i.toString().toList().distinctBy { it }.dropLastWhile { i.toString().contains('0') }.size == 3) {
                baseball.forEach {
                    if(getScore(it[0].toString(),i.toString()) == Pair(it[1],it[2])) cnt++
                }
                if(cnt == baseball.size) answer++
                cnt = 0
            }
        }

        println(answer)

    }

    fun getScore(score:String , question:String) : Pair<Int,Int>{
        var strike = 0
        var ball = 0
        for(i in score.indices){
            for(j in question.indices){
                if(score[i] == question[j] && i==j) strike++
                else if(score[i] == question[j] && i!=j) ball++
            }
        }

        return Pair(strike,ball)
    }
}
