package com.example.nbcamp_kotlin_team_9.Nann

import com.example.nbcamp_kotlin_team_9.Item
import com.example.nbcamp_kotlin_team_9.order.Order.Companion.RED
import com.example.nbcamp_kotlin_team_9.order.Order.Companion.RESET

class Nan(override val name: String,
          override val description: String,
          override val price: Int) : Item {

    override fun displayItemInfo() {
        println(RED+"음식 이름: $name"+ RESET)
        println(RED+"설명: $description"+ RESET)
        println(RED+"가격: $price 원"+ RESET)
    }
}
