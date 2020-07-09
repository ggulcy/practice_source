package com.example.exampleapp.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Person::class],version = 1)
abstract class PersonDatabase:RoomDatabase(){
    abstract fun getPersonDao():PersonDao

    companion object{
        private var INSTANCE:PersonDatabase? = null

        fun getInstance(context: Context):PersonDatabase?{
            if(INSTANCE == null){
                synchronized(PersonDatabase::class){
                    INSTANCE = Room.databaseBuilder(
                        context,
                        PersonDatabase::class.java,
                        "person.db"
                    ).build()
                }
            }
            return INSTANCE
        }
    }
}