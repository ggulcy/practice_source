package com.ggulcy.codingtest.level2

import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 주식가격 {
    @Test
    fun main() {
        var prices = intArrayOf(1,2,3,2,3)
        solution(prices)
    }

    fun solution(prices:IntArray){
        var answer = intArrayOf(0)

        var queue:Queue<Pair<Int,Int>> = LinkedList()
        prices.forEachIndexed { index, i ->
            queue.add(Pair(i,prices.size-index))
        }

        while(queue.isNotEmpty()){
            var value = queue.poll()
            var b = queue.find { value.first > it.first }
            if(b == null) println(queue.size)
            else {
                println(value.second - b.second)
            }
        }

    }
}
