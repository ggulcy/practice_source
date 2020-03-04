package com.ggulcy.codingtest

import org.junit.Test
import java.util.*
import kotlin.random.Random


class Greedy{


    @Test
    fun main(){
        // 1. 전체 n 에서 lost의 개수를 뺀다
        // 2. lost중 reserve로 인해 save된 개수를 센다 중복없이

        var info = generate()
        var n = info.n
        var lost = info.lost
        var reserve = info.reserve

        for(i in lost) {
            if (reserve.contains(i)) {
                reserve[reserve.indexOf(i)] = 0
                lost[lost.indexOf(i)] = 0
            }
        }
        for(i in lost){
            if (reserve.contains(i-1) && (i - 1) != 0) {
                reserve[reserve.indexOf(i - 1)] = 0
                lost[lost.indexOf(i)] = 0
            } else if (reserve.contains(i + 1)) {
                reserve[reserve.indexOf(i + 1)] = 0
                lost[lost.indexOf(i)] = 0
            }
        }

        println("\n")
        print("lost(${lost.size}) : [ ")
        for(i in lost) print("$i ")
        println("]")
        print("reserve(${reserve.size}) : [ ")
        for(i in reserve) print("$i ")
        print("]")

        var answer = 0
        for(i in lost){
            if(i != 0) answer++
        }
        answer = n - answer

    }
    class Info(
        var n : Int,
        var lost : IntArray,
        var reserve : IntArray
    )

    private fun generate():Info{
        var n = rand(2,30)
        var lost = IntArray(rand(1,n))
        var reserve =IntArray(rand(1,n))
        var nansu = 0


        for(i in lost.indices){
            do{
                nansu = rand(1,n)
            }
            while (lost.indexOf(nansu) != -1)
            lost[i] = nansu
        }

        nansu = 0
        for(i in reserve.indices){
            do{
                nansu = rand(1,n)
            }
            while (reserve.indexOf(nansu) != -1)
            reserve[i] = nansu
        }

        println("생성된 데이터 출력")
        println("전체 학생 수 : $n")
        print("lost(${lost.size}) : [ ")
        for(i in lost) print("$i ")
        println("]")
        print("reserve(${reserve.size}) : [ ")
        for(i in reserve) print("$i ")
        print("]")


        return Info(n,lost,reserve)
    }

    fun solution(n:Int, lost: IntArray, reserve:IntArray): Int{
        var answer = 0
        return answer
    }


    fun rand(from:Int, to:Int):Int{
        return Random.nextInt(to-from+1) + from
    }











}