package com.ggulcy.codingtest

import org.junit.Test
import kotlin.random.Random


class 모의고사{
    @Test
    fun 모의고사() {
        // 1번 수포자 1,2,3,4,5 ...
        // 2번 수포자 2,1, 2,3, 2,4, 2,5 ...
        // 3번 수포자 3,3,1,1,2,2,4,4,5,5 ...


        // 문제 발생 랜덤 갯수
        var examCnt = Random.nextInt(5) + 5
//        println("생성된 문제 갯수 : $examCnt")

//        var answers = arrayOfNulls<Int>(examCnt)
//        for (i in 0 until examCnt) {
//            answers[i] = Random.nextInt(5) + 1
//            print(" " + answers[i])
//        }

        var answers = intArrayOf(5,5)

//        checkDap(exam)
        var one = arrayOf(1, 2, 3, 4, 5)
        var two = arrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var three = arrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)


        var result = arrayOf(checkPattern(one, answers),checkPattern(two, answers),checkPattern(three, answers))
        var mutableAnswer = mutableListOf<Int>()


        for(i in result.indices){
            if(result[i] == result.max() && result.max()!= 0) mutableAnswer.add(i+1)
        }

        var answer = IntArray(mutableAnswer.size)

        for(i in mutableAnswer.indices){
            answer[i] = mutableAnswer[i]
        }

        println("\n 최종 답 \n")
        for(test in answer){
            print(test)
        }

    }


    fun checkPattern(pattern: Array<Int>, answers: IntArray): Int {
        var cnt = 0
        var result = 0
        println("\n----")
        for (i in answers.indices) {
            if(pattern[cnt++] == answers[i]){
                result++
                println(answers[i])
            }
            if (cnt == pattern.size) cnt = 0
        }
        println("\nresult = $result")
        return result
    }
//
//
//    fun checkDap(checkArray: Array<Int?>): IntArray {
//        //문제의 각 정답마다의 갯수
//        var dap = intArrayOf(0, 0, 0, 0, 0)
//        for (i in checkArray) {
//            when (i) {
//                1 -> dap[0]++
//                2 -> dap[1]++
//                3 -> dap[2]++
//                4 -> dap[3]++
//                5 -> dap[4]++
//            }
//        }
//        println("")
//        for (i in dap) {
//            println(i)
//        }
//        return dap
//    }
}