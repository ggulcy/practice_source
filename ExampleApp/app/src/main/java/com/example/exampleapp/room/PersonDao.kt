package com.example.exampleapp.room

import androidx.room.*
import io.reactivex.Flowable
import io.reactivex.Single


@Dao
interface PersonDao {
    @Query("SELECT * FROM person")
    fun getPersons():Flowable<List<Person>>


    @Query("DELETE FROM person")
    fun clearAll()

    @Insert(onConflict = OnConflictStrategy.REPLACE)//덮어씌우기 옵션
    fun insert(vararg person:Person)

    @Update
    fun update(vararg person:Person)

    @Delete
    fun delete(vararg person:Person)




}