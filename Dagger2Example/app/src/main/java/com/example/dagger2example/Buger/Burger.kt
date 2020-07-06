package com.example.dagger2example.Buger


class Burger constructor(bun: WheatBun, patty: BeefPatty) {

    var bun = bun
    var patty = patty

    data class WheatBun(
        var bun: String = "밀빵"
    )

    data class BeefPatty(
        var patty: String = "소고기"
    )

}