package com.ggulcy.codingtest.level2

import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 프린터 {
    @Test
    fun main() {

        var priorities = intArrayOf(2, 1, 3, 2)
        var location = 2

        println(solution(priorities, location))


    }

    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        var workList = arrayListOf<Work>()
        priorities.forEachIndexed { index, i ->
            workList.add(Work(i, index))
        }
        var prioritiesQueue: Queue<Work> = LinkedList(workList)

        while (prioritiesQueue.isNotEmpty()) {
            var target = prioritiesQueue.poll()
            var check = prioritiesQueue.any {
                target.priorty < it.priorty
            }
            if(!check){
                answer++
                if(location == target.idx) break
            }
            else prioritiesQueue.add(target)
        }
        return answer

    }
    data class Work(var priorty: Int, var idx: Int)


}
