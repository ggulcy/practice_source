package com.ggulcy.codingtest

import org.junit.Test
import kotlin.random.Random


class K번째수 {
    @Test
    fun main() {
//        generate()

        var array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
        var commands = Array(3) { IntArray(3) }
        commands[0] = intArrayOf(2, 5, 3)
        commands[1] = intArrayOf(4, 4, 1)
        commands[2] = intArrayOf(1, 7, 3)



        var answer = IntArray(commands.size)
        for (i in commands.indices) {
            var front = commands[i][0]
            var back = commands[i][1]
            var choice = commands[i][2]
            var newArray = mutableListOf<Int>()
            for (j in front - 1 until back) {
                newArray.add(array[j])
            }

            var sortedArray = newArray.sortedBy { it.inc() }

            answer[i] = sortedArray[choice-1]

            printArray(sortedArray.toMutableList())


        }

        printArray(answer.toMutableList())


        //모범 답안
//        commands.map {
//            command->
//            array.slice(IntRange(command[0]-1, command[1]-1)).sorted()[command[2]-1]
//        }.toIntArray()



    }



    fun rand(from: Int, to: Int): Int {
        return Random.nextInt(to - from + 1) + from
    }

    fun printArray(array: MutableList<Int>) {
        println("")
        print("[ ")
        for (i in array) print("$i ")
        println("]")
    }
}