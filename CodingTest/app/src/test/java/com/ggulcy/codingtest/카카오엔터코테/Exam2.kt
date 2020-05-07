package com.ggulcy.codingtest.카카오엔터코테

import org.junit.Test
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Exam2 {
    @Test
    fun main() {
        var timestamp = arrayOf(2,2,4,8,11,28,30)
        var top = arrayOf(0,5,5,15)
        solution(timestamp,top)


    }

    fun solution(timestamp:Array<Int>,top:Array<Int>):Int{
        val queue = PriorityQueue(timestamp.toList())

        var answer = 0
        top.forEachIndexed { idx, t_value ->
            val sorted = queue.filter { t_value >= it }
            var targetQueue = PriorityQueue(Collections.reverseOrder())
            targetQueue.addAll(sorted)
            var cnt = 0
            while (targetQueue.isNotEmpty() && cnt < 5){
                queue.remove(targetQueue.poll())
                cnt++
            }
            answer += cnt
        }

        println(answer)



        return 0
    }
}
