package com.ggulcy.codingtest.level2

import org.junit.Test

import java.util.*
import kotlin.math.sign

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 쇠막대기 {
    @Test
    fun main() {
        var arrangement = "(()())"
        solution(arrangement)


    }

    fun solution(arrangement:String) : Int{
        var answer = 0
        var arr:Stack<Char> = Stack()
        var prev = ' '
        arrangement.forEachIndexed { index, c ->
            if(c == '(') arr.add(c)
            else{
                arr.pop()
                if(prev == '(') answer += arr.size
                else if(prev == ')') answer++
            }
            prev = c
        }
        return answer
    }

}
