package com.ggulcy.codingtest

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

import org.junit.Test
import java.io.ByteArrayInputStream


class Main {
//    fun main(args: Array<String>) {
//        val br = BufferedReader(InputStreamReader(System.`in`))
//        val token = StringTokenizer(br.readLine())
//        println (Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken()))
//        br.close ()
//    }​

//    import java.util.Scanner
//    @Test
//    fun main(args: Array<String>) = with(Scanner(System.`in`)) {
//        println(nextInt() + nextInt())
//    }

    @Test
    fun main(){
        val data = "Users Input"
        System.setIn(ByteArrayInputStream(data.toByteArray()))

    }






}
