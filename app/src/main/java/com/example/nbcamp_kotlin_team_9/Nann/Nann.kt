package com.example.nbcamp_kotlin_team_9.Nann

import com.example.nbcamp_kotlin_team_9.Item

class Nan(override val name: String,
          override val description: String,
          override val price: Int) : Item {

    override fun displayItemInfo() {
        println("음식 이름: $name")
        println("설명: $description")
        println("가격: $price 원")
    }
}
