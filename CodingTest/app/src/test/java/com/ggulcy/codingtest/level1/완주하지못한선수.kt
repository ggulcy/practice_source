package com.ggulcy.codingtest.level1

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 완주하지못한선수 {
    @Test
    fun main() {
        var participant = listOf("stanko","mislav","mislav","ana")
        var completion = listOf("stanko","ana","mislav")

        var answer = participant.toMutableList()

        completion.forEach {s->
            answer.remove(participant.find { s == it })
        }

        println(answer[0])
    }
}
