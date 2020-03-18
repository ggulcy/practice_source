package com.ggulcy.codingtest.level1

import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 실패율카카오 {
    @Test
    fun main() {

        var stages = intArrayOf(2,1,2,6,2,4,3,3)
        var N = 5


        var rates = mutableMapOf<Int,Double>()

        for(i in 1 .. N){
            var clear = 0
            var cur = 0
            stages.forEach {
                if(it >= i) {
                    clear++
                    if(it == i) cur++
                }
            }
            rates.put(i,cur.toDouble()/clear.toDouble())
        }

//        var result = rates.toList().sortedBy { (_, value) -> value}.reversed().toMap()

        var sorted = rates.toSortedMap().values



//        with(rates){
//            sort()
//            reverse()
//        }

//        result.forEach { println(it) }


    }
}
