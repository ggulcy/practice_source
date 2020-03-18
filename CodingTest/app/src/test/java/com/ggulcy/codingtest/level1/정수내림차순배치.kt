package com.ggulcy.codingtest.level1

import org.junit.Test

import org.junit.Assert.*
import kotlin.math.absoluteValue

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 정수내림차순배치 {
    @Test
    fun main() {
        var n = 1123
        var answer =""
//        n.absoluteValue.toString().toList().sorted().reversed().forEach {
//             answer+=it
//        }


        var p = String(n.toString().toCharArray().sortedArrayDescending())
    }
}
