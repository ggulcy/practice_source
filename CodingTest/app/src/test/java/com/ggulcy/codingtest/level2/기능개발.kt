package com.ggulcy.codingtest.level2

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 기능개발 {
    @Test
    fun main() {
        var progresses = intArrayOf(93, 30, 55)
        var speeds = intArrayOf(1, 30, 5)
        var times = mutableListOf<Int>()
        var answer = mutableListOf<Int>()

        (progresses.indices).forEach { i->
            var time = getDate(progresses[i],speeds[i])
            if(times.size == 0 || times[times.lastIndex] < time){
                times.add(time)
                answer.add(1)
            }
            else {
                times.add(times[i - 1])
                answer[answer.lastIndex]++
            }
        }


        answer.forEach { println(it) }




    }
    //class queue

    inner class Queue(max:Int){
        var front:Int = 0
        var rear:Int = -1
        var max:Int = max
        var queue = IntArray(max)

        fun empty():Boolean{
            return front == rear+1
        }
        fun full():Boolean{
            return rear == max-1
        }

        fun insert(item:Int){
            if(!full()) {
                queue[rear++] = item
            }
        }
        fun peek():Int{
            return if(!empty()){
                queue[front]
            } else -1
        }
        fun remove():Int{
            var item = peek()
            front++
            return item
        }
    }

    private fun getDate(progress: Int, speed: Int) =
        if ((100 - progress) % speed == 0) (100 - progress)/speed else (100 - progress) / speed + 1
}



