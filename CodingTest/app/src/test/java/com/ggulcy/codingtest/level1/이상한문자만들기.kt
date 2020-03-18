package com.ggulcy.codingtest.level1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 이상한문자만들기 {
    @Test
    fun main() {

        var s = "try hello world"
        var answer = ""
        var idx = 0


        for(i in s.indices){
            if((idx == 0 || idx % 2 ==0) && s[i] != ' ') {
                answer+=s[i].toUpperCase()
                idx++
            } else if(idx % 2 != 0 && s[i] != ' '){
                answer+=s[i].toLowerCase()
                idx++
            } else {
                idx = 0
                answer += ' '
            }
        }
//
//
//



        print(answer)



    }
}
