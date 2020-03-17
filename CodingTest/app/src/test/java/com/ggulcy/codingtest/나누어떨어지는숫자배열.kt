package com.ggulcy.codingtest

import org.junit.Test


class 나누어떨어지는숫자배열 {
    @Test
    fun main() {
        var arr = intArrayOf(2,36,1,3)
        var divisor = 7
        var list = ArrayList<Int>()


        with(list){
            for(i in arr) if(i%divisor==0) add(i)
            sortBy { it.inc() }
        }


        var answer =if(list.size != 0) {
            list.toIntArray()
        } else {
            intArrayOf(-1)
        }

        for(i in answer) println(i)

    }

}