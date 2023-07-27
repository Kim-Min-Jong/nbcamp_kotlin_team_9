package com.example.nbcamp_kotlin_team_9.ChickenCurry

import com.example.nbcamp_kotlin_team_9.Item
import com.example.nbcamp_kotlin_team_9.order.Order
import com.example.nbcamp_kotlin_team_9.order.Order.Companion.RESET

class ChickenCurry(
    override val name: String,
    override val description: String,
    override val price: Int
) : Item {override fun displayItemInfo() {
    println(Order.RED +"${name} | ${price}원 | ${description}"+RESET)
}
}