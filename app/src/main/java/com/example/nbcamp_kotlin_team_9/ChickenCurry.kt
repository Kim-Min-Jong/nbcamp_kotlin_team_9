package com.example.nbcamp_kotlin_team_9

class ChickenCurry(
    override val name: String,
    override val description: String,
    override val price: Int
) : Item {override fun displayItemInfo() {
    println("${name} | ${price}원 | ${description}")
}
}