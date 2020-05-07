package com.ggulcy.codingtest.카카오엔터코테

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Exam3 {
    @Test
    fun main() {

        var arr = arrayOf(2,5,4,6,8)
        var x = 3
        solution(x,arr)



    }

    fun solution(x:Int,arr:Array<Int>): Int {
        var arrange = x-1
        var data = mutableListOf<Int>()

        for(i in arr.indices){
            if(i+arrange < arr.size) {
                arr.slice(i..i + arrange).min()?.let {
                    data.add(it)
                }
            }
        }

//        arr.forEachIndexed { i, value ->
//            if(i+arrange < arr.size) {
//                println(arr.slice(i.. i+arrange))
////                arr.slice(i..i + arrange).min()?.let {
////                    data.add(it)
////                }
//            }
//        }
//        println(data.max())
        return 0
    }
}
