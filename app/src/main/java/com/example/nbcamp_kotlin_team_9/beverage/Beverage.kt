package com.example.nbcamp_kotlin_team_9.beverage

import com.example.nbcamp_kotlin_team_9.Item
import com.example.nbcamp_kotlin_team_9.order.Order.Companion.RED
import com.example.nbcamp_kotlin_team_9.order.Order.Companion.RESET


class Beverage(override val name: String, override val description: String, override val price: Int) :
    Item {

    override fun displayItemInfo() {
        println(RED+"${name}를 선택하셨습니다."+ RESET)
    }
}