package com.example.dagger2example.Chef



class Chef constructor(private val firstName:String, private val lastName:String){

    @Override
    override fun toString():String = "Chef [firstName = $firstName , lastName = $lastName"

}