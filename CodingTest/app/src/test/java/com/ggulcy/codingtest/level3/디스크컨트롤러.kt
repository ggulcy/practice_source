package com.ggulcy.codingtest.level3

import org.junit.Test

import org.junit.Assert.*
import java.util.*


/* Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 디스크컨트롤러 {
    @Test
    fun main() {
        var jobs = Array(3) { IntArray(2) }
        jobs[0][0] = 3
        jobs[0][1] = 11

        jobs[1][0] = 1
        jobs[1][1] = 9

        jobs[2][0] = 2
        jobs[2][1] = 6


//        var jq = PriorityQueue<IntArray>(kotlin.Comparator { o1, o2 ->  if(o1[1] >= o2[1]) 1 else -1})

        var jq:PriorityQueue<Pair<Int,Int>> = PriorityQueue(compareBy { it.second })
        var jobList = jobs.map { it[0] to it[1] }.sortedBy { it.first }
        var current = 0


        while(jobList.isNotEmpty() || jq.isNotEmpty()){
            var c = jobList.filter { it.first >= current }
            jq.addAll(c)
            jq.drop(c.size)
            if(jq.isEmpty()){
                current = jobList.first().first
            } else {

            }

        }





    }
}
