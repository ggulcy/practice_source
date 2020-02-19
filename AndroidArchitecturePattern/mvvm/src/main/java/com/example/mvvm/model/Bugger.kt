package com.example.mvc.model


class Bugger constructor(){
    var petty:Recipe.Petty? = null
    var bread:Recipe.Bread? = null

    constructor(petty: Recipe.Petty, bread: Recipe.Bread) : this() {
        this.petty = petty
        this.bread = bread
    }
}