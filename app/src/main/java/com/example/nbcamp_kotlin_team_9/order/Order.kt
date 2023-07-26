package com.example.nbcamp_kotlin_team_9.order

import com.example.nbcamp_kotlin_team_9.Item
import com.example.nbcamp_kotlin_team_9.UserInterface
import java.io.BufferedReader
import java.lang.Exception

class Order(private val br: BufferedReader) {
    private lateinit var vegetableCurry: Item
    private lateinit var chickenCurry: Item
    private lateinit var beverage: Item
    private lateinit var nan: Item

    private val list: ArrayList<Item> = ArrayList()

    fun addCurry() {
        println("[Curry category]")
        println("1. 야채커리   2. 치킨커리")
        println("둘 중 하나를 선택해주세요")
        val category = br.readLine()
        when(category) {
            "1" -> {
                addVegetableCurry()
            }
            "2" -> {
                addChickenCurry()
            }
            else -> {
                println("잘못된 선택입니다.")
            }
        }
    }
    private fun addVegetableCurry() {
        println("[Vegetable Curry Menu]")
//        MenuList.vegetableCurryList.forEachIndexed { idx, vegetable ->
//            println("${idx+1}. ${vegetable.name} | ${vegetable.price}원 | ${vegetable.description}")
//        }
        println("0. 뒤로가기")
        val select = br.readLine()
        when(select) {
            "0" -> addCurry()
            else -> {
                try{
//                    list.add(MenuList.vegetableCurryList[select.toInt() - 1])
                } catch (e: Exception) {
                    println("잘못 입력하셨습니다.")
                    return
                }
            }
        }
    }
    private fun addChickenCurry() {
        println("[Chicken Curry Menu]")
//        MenuList.nanList.forEachIndexed { idx, chicken ->
//            println("${idx+1}. ${chicken.name} | ${chicken.price}원 | ${chicken.description}")
//        }
        println("0. 뒤로가기")
        val select = br.readLine()
        when(select) {
            "0" -> addCurry()
            else -> {
                try{
//                    list.add(MenuList.chickenCurryList[select.toInt() - 1])
//                    chickenCurry = MenuList.chickenCurryList[select.toInt() - 1]
//                    list.add(chickenCurry)
                } catch (e: Exception) {
                    println("잘못 입력하셨습니다.")
                    return
                }
            }
        }
    }
    fun addNan() {
        println("[Nan Menu]")
//        MenuList.nanList.forEachIndexed { idx, nan ->
//            println("${idx+1}. ${nan.name} | ${nan.price}원 | ${nan.description}")
//        }
        println("0. 뒤로가기")
        val select = br.readLine()
        when(select) {
            "0" -> UserInterface().run()
            else -> {
                try{
//                    list.add(MenuList.nanList[select.toInt() - 1])
//                    nan = MenuList.nanList[select.toInt() - 1]
//                    list.add(nan)
                } catch (e: Exception) {
                    println("잘못 입력하셨습니다.")
                    return
                }
            }
        }
    }

    fun addBeverage() {
        println("[Beverage Menu]")
//        MenuList.beverageList.forEachIndexed { idx, beverage ->
//            println("${idx+1}. ${beverage.name} | ${beverage.price}원 | ${beverage.description}")
//        }
        println("0. 뒤로가기")
        val select = br.readLine()
        when(select) {
            "0" -> UserInterface().run()
            else -> {
                try{
//                    list.add(MenuList.beverageList[select.toInt() - 1])
//                    beverage = MenuList.beverageList[select.toInt() - 1]
//                    list.add(beverage)
                } catch (e: Exception) {
                    println("잘못 입력하셨습니다.")
                    return
                }
            }
        }
    }

    fun viewCart() {
        println("현재까지의 주문목록입니다.")
        printList(list)
        println("목록에서 제거하시겠습니까?")
        println("1. 예   2.아니오(구매확정)")
        val remove = br.readLine()
        when(remove) {
            "1" -> removeItem(list)
            "2" -> confirmItem(list)
        }
    }

    private fun confirmItem(list: ArrayList<Item>) =
        println("총액은 ${list.sumOf { it.price }} 원 입니다")

    private fun removeItem(list: ArrayList<Item>) {
        printList(list)
        println("어떤 메뉴를 삭제하시겠습니까?")
        val num = br.readLine()
        try{
            when(val intNum = num.toInt()) {
                in 0 until list.size -> {
                    list.removeAt(intNum  - 1)
                }
                else -> println("주문 목록 범위를 벗어났습니다.")
            }
        } catch (e: Exception){
            println("숫자를 입력해주세요")
        }

    }
    private fun printList(list: ArrayList<Item>) = list.forEachIndexed { idx, item ->
        println("${idx+1}. ${item.name} | ${item.price}원 | ${item.description}")
    }
}
