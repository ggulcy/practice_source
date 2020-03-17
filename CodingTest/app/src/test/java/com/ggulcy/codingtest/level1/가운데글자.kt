package com.ggulcy.codingtest.level1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 가운데글자 {

    @Test
    fun test(){
        var s = "abcde"
        var answer = ""

        if(s.length%2 == 0){
            answer = s[s.length/2 - 1].toString() + s[s.length/2]
        }else{
            answer = s[s.length/2].toString()
        }


        print(answer)




    }

}
