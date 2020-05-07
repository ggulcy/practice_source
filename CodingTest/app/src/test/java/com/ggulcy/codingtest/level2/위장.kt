package com.ggulcy.codingtest.level2

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 위장 {
    @Test
    fun main() {
        var clothes = arrayOf(
            arrayOf("yellow_hat","headgear") , arrayOf("blue_sunglasses","eyewear") , arrayOf("green_turban","headgear")
        )


        var hash = hashMapOf<String,Int>()
        clothes.forEach {
            if(hash[it[1]] == null) hash[it[1]] = 1
            else hash[it[1]] = hash[it[1]]!!.plus(1)
        }

        var answer = 1
        hash.forEach {
            answer *= it.value+1
        }
        answer -= 1


    }


}
