package com.ggulcy.codingtest.level2

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class 다리를지나는트럭 {
    @Test
    fun main() {
        var bridge_length = 2
        var weight = 10
        var truck_weights = arrayOf(7,4,5,6)

        var time = 0
        var cnt = 0

        var trucks = arrayListOf<Truck>()
        truck_weights.forEach {
            trucks.add(Truck(it,bridge_length))
        }



        var bridge = Bridge(size = truck_weights.size,weight = weight)

        while(true){
//            bridge.printBridge()
            //꺼낼것이 있나 체크
            bridge.check()

            //넣을것이 있나 체크
            if( cnt < trucks.size && bridge.isPossible(trucks[cnt])) {
                bridge.insert(trucks[cnt++])
            }
            //시간 증가
            time++
            if(bridge.bridge.size == 0) break

        }


    }

    data class Truck(var truck_weight:Int, var loc:Int)

    class Bridge(size:Int , weight:Int){
        var bridge = arrayListOf<Truck>()
        var weight = weight

        fun insert(truck:Truck){
            truck.loc -= 1
            bridge.add(truck)
        }

        fun isPossible(truck:Truck):Boolean{
            var sum = 0
            bridge.forEach { sum += it.truck_weight }
            return weight -  sum >= truck.truck_weight
        }

        fun check() {
            bridge.forEachIndexed { index, truck ->
                bridge[index].loc -= 1
            }
            var temp = bridge.filter { it.loc != -1 }
            bridge.clear()
            bridge.addAll(temp)

        }

        fun printBridge(){
            bridge.forEach { println("${it.truck_weight} , ${it.loc}") }
        }


    }
}
