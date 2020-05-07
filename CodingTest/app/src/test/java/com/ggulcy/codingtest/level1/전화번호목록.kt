package com.ggulcy.codingtest.level1

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 전화번호목록 {
    @Test
    fun main() {
        var phone_book = listOf<String>("123","456123","789")
        var answer = true




        phone_book.forEachIndexed { i,s ->
             var temp = phone_book.find{
                i != phone_book.indexOf(it) && it.startsWith(s)
            }
//            println(temp)
            if(!temp.isNullOrEmpty()) answer = false
        }

        println(answer)


    }
}
