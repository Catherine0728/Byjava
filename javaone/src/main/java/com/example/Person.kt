package com.example

/**
 * Created by catherine on 2017/5/24.
 */
class Person(name: String, age: Int) {
    var name: String
    var age: Int

    init {
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "name is $name,age is $age"
    }

}