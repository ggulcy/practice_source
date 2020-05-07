package com.ggulcy.codingtest.level2

import org.junit.Test

import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 더맵게 {
    @Test
    fun main() {
        var scoville = intArrayOf(2)
        var k = 7
        var queue:PriorityQueue<Int> = PriorityQueue(scoville.toList())


        while (queue.size > 1 && queue.peek() < k){
            queue.add(queue.poll() + queue.poll()*2)
        }

        var a = queue.toList().none { k < 7 }

        println(a)
//        var answer = mutableListOf<Int>()

    }
}
