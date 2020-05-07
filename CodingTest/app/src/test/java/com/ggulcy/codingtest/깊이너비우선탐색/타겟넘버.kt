package com.ggulcy.codingtest.깊이너비우선탐색

import org.junit.Test


class 타겟넘버 {
    @Test
    fun main() {
        var a = intArrayOf(1,1,1,1,1)
        println(solution(a,3))
    }


    var answer = 0
    fun solution(numbers:IntArray , target:Int):Int{
        dfs(numbers,target,0,0)
        return answer
    }

    fun dfs(numbers: IntArray , target:Int , sum:Int , node:Int){
        if(numbers.size <= node){
            if(sum == target) answer++
            return
        }
        dfs(numbers,target,sum+numbers[node],node+1)
        dfs(numbers,target,sum-numbers[node],node+1)

    }
}