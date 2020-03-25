package com.ggulcy.codingtest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun main() {
        var list = mutableListOf<MyUnit>()
        list.add(MyUnit(4,-1))
        list.add(MyUnit(5,0))


        var test = list.filter {
            it.b != -1
        }
        test.forEach { println(it) }


    }

    data class MyUnit(var a:Int , var b:Int)
}
