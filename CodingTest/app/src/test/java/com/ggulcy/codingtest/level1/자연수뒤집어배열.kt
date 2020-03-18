package com.ggulcy.codingtest.level1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 자연수뒤집어배열 {
    @Test
    fun main() {
        var n = 12345




        var answer = mutableListOf<Int>()

        with(answer) {
            n.toString().reversed().forEach {
                answer.add(it.toString().toInt())
            }
            toIntArray()
        }

        answer.forEach { println(it) }

    }
}
