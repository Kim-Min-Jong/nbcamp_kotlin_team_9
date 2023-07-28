package com.example.nbcamp_kotlin_team_9.vegetablecurry

import com.example.nbcamp_kotlin_team_9.Item
import com.example.nbcamp_kotlin_team_9.order.Order.Companion.RED
import com.example.nbcamp_kotlin_team_9.order.Order.Companion.RESET


class VegetableCurry(
    override val name: String,
    override val description: String,
    override val price: Int,
) : Item {
    override fun displayItemInfo() {
        println(RED+ "메뉴: ${name} | 설명: ${description} | 가격: ${price}"+ RESET)


    }
}








