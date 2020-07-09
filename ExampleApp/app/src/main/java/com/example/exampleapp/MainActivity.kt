package com.example.exampleapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.exampleapp.room.DbWorkerThread
import com.example.exampleapp.room.Person
import com.example.exampleapp.room.PersonDatabase
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var dbWorkerThread: DbWorkerThread
    private var disposable = CompositeDisposable()
    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbWorkerThread = DbWorkerThread("dbWorkerThread")
        dbWorkerThread.start()

        val person = Person(0, "CHAN", "Developer")




        btn_insert.setOnClickListener {
            Observable.just(person)
                .subscribeOn(Schedulers.io())
                .subscribe({
                    PersonDatabase
                        .getInstance(context = this)!!
                        .getPersonDao()
                        .insert(it)
                    println("Succeess")
                }, {
                    println(it.message)
                }).addTo(disposable)
        }


        btn_get.setOnClickListener {
            PersonDatabase
                .getInstance(this)!!
                .getPersonDao()
                .getPersons()
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe {
                    //구독시 사용할 함수
                }.doOnTerminate {
                    //구독이 끝날때 사용할 함수 ex) progress
                }.subscribe({
                    Toast.makeText(this,it.size.toString(),Toast.LENGTH_LONG).show()
                },{
                    println(it.message)
                }).addTo(disposable)
        }
    }
}