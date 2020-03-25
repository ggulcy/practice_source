package com.ggulcy.codingtest.level2

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 탑 {
    @Test
    fun main() {
        var heights = intArrayOf(3,9,9,3,5,7,2)
        var arr = heights.toList().reversed()
        var answer = IntArray(heights.size){0}



        for(i in arr.indices){
            for(j in i+1 until arr.size){
                if(arr[i] < arr[j]) {
                    answer[heights.size-1-i] = heights.size-j
                    break
                }
            }
        }
        answer.forEach { print(it) }


    }
}
