package com.example.nbcamp_kotlin_team_9

import com.example.nbcamp_kotlin_team_9.order.Order

//import com.example.nbcamp_kotlin_team_9.order.Order

class UserInterface {
    private val br = System.`in`.bufferedReader()
    private val order = Order(br)
    fun run() {
        while(true) {
            println("Everest cares about your health")
            println("2002년 한국에서는 최초로 문을 연 네팔음식점")
            println("동대문 에베레스트 레스토랑입니다~")
            println("카테고리를 선택해주세요!")
            println("[카테고리]")
            println("1. 커리 | 인도 티벳 문화를 느낄 수 있는 정통커리")
            println("2. 난(빵) | 커리와 곁들여 먹는 부드러운 난")
            println("3. 음료 | 인도 티벳의 전통음료")
            println("4.현재까지 주문목록")
            println("5. 시스템 종료")
            val category = br.readLine()
            when(category) {
                "1" -> {
                    order.addCurry()
                }
                "2" -> {
                    order.addNan()
                }
                "3" -> {
                    order.addBeverage()
                }
                "4" -> {
                    order.viewCart()
                }
                "5" -> {
                    println("시스템을 종료합니다.")
                    br.close()
                    break
                }
                else -> {
                    println("잘못 입력하셨습니다. 다시 입력해주세요")
                    continue
                }
            }
        }
    }
}