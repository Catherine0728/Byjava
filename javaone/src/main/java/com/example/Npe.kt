package com.example

/**
 * Created by catherine on 2017/5/25.
 */

fun main(args: Array<String>) {
    var b: String?
    b = null

    println(b?.length)
    var l = b?.length ?: -1
    println(l)
    var a: Int? = b as? Int
    println(a)


}

