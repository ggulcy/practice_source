package com.ggulcy.codingtest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 내맘대로문자정렬하기 {
    @Test
    fun main() {
        var strings = mutableListOf("sun", "bed", "car")
        var n = 1





//
        var answer = with(strings) {
            sort()
            sortedWith(Comparator { a, b ->
                when {
                    a[n] > b[n] -> 1
                    a[n] < b[n] -> -1
                    else -> 0
                }
            })
        }
        answer.toTypedArray()
//

    }


}
