package com.example


/**
 * Created by catherine on 2017/5/24.
 *
 * if...else 正常使用，不过移除了switch用更强大的when替代，
 * when子式可以是常量、变量、返回数值的表达式、返回Boolean值的表达式，
 * 强大到用来替换if...else if
 */

 class When {

    fun whenTest() {
        val x = 10
        when (x) {
        //常量
            2 -> println("等于2")
        //数值表达式
            if (x > 0) 1 else -1 -> println("大于0并等于1，或小于0并等于-1")
        //boolean类型表达式
            in 1..5 -> println("范围匹配1-5")
            is Int -> println("类型判断")
            !in 6..9 -> println("不是6-9")
            else -> println("else")

        }
    }

}

fun main(args: Array<String>) {
    val w = When()
    w.whenTest()

    var ii :Int =4
    var list= ArrayList<Person>()
    for (i in ii downTo 0){
        var person=Person("name",i)
        list.add(person)

    }
    println(list)



}

fun forList(){
    val list=ArrayList<String>()

    for (i in list.indices)

}
