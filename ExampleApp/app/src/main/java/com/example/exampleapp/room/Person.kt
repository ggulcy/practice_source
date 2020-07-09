package com.example.exampleapp.room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class Person(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name:String,
    val job:String
)