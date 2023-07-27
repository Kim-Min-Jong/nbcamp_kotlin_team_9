package com.example.nbcamp_kotlin_team_9


class Beverage(override val name: String, override val description: String, override val price: Int) : Item {

    override fun displayItemInfo() {
        println("${name}를 선택하셨습니다.")
    }
}