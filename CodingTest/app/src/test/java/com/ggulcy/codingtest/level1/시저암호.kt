package com.ggulcy.codingtest.level1

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 시저암호 {
    @Test
    fun main() {
        var s = "a B  a"
        var n = 24

//
//        var blankIdx = emptyList<Int>()
//        for(i in s.indices){
//            if(s[i] == ' ') blankIdx += i
//        }
//
//        s = s.replace(" ","")


        var answer = ""
        for(txt in s){
            answer += if(txt.isUpperCase()) {
                when {
                    txt == ' ' -> ' '
                    txt.toByte() + n > 'Z'.toByte() -> (txt.toByte() + n - 26).toChar()
                    else -> (txt.toByte()+n).toChar()
                }
            }else{
                when {
                    txt == ' ' -> ' '
                    txt.toByte() + n > 'z'.toByte() -> (txt.toByte() + n - 26).toChar()
                    else -> (txt.toByte()+n).toChar()
                }
            }
        }



        print(answer)

    }
}
