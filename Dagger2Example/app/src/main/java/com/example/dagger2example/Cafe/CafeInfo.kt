package com.example.dagger2example.Cafe





class CafeInfo {
    private lateinit var name:String

    constructor(){

    }

    constructor(name: String){
        this.name = name
    }



    fun welcome(){
        println("Welcome :: $name")
    }
}