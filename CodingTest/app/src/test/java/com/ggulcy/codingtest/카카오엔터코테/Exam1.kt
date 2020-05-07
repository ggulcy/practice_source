package com.ggulcy.codingtest.카카오엔터코테

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Exam1 {
    @Test
    fun main() {

        var arr = arrayOf(10,4,-8,7)
        solution(arr)


    }

    fun solution(arr:Array<Int>):Int{




//        var cnt = 0
//        for(i in arr.indices){
//            if(i != arr.size-1) {
//                if(arr.slice(0..i).sum() > arr.slice(i + 1 until arr.size).sum()) cnt++
//            }
//        }


        var cnt = 0
//        for(i in arr.indices){
//            for(j in cnt..i){
//                println(j)
//                println(j+1 until arr.size)
//            }
//            cnt++
//            println("---")
//        }

//        for(i in 1 until arr.size){
//            if(arr.take(i).sum() > arr.takeLast(arr.size-i).sum()) cnt++
//        }


        for(i in 0..arr.size-2){
            var temp = 0
            for(j in 0..i) temp += arr[j]
            for(k in i+1 until arr.size) temp -= arr[k]
            if(temp > 0) cnt++
        }
        println(cnt)

        return 0
    }
}
