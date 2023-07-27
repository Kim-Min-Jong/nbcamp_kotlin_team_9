package com.example.nbcamp_kotlin_team_9

import com.example.nbcamp_kotlin_team_9.order.MenuList

class VegetableCurry(
    override val name: String,
    override val description: String,
    override val price: Int,
) : Item {
    override fun displayItemInfo() {
        println("메뉴: ${name} | 설명: ${description} | 가격: ${price}")


    }
}








