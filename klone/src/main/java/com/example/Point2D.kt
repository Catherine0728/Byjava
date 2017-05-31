package com.example

/**
 * Created by catherine on 17/5/22.
 */

open public class Point2D//open 允许继承，不写open的类默认是final的

public constructor(x: Int, y: Int) {
    //primary constructor 的头部声明
    //primary constructor 是特殊的构造函数，只能定义一个
    //而且一旦定义了primary constructor，其它构造函数都必须调用这个primary constructor

    var x: Int = -1//这两句初始化代码其实编译之后
    var y: Int = -1//会被放到init代码块的最前面

    //primary constructor
    init {
        println("init")
        this.x = x
        this.y = y
        show()
        println("primary constructor :Point 2D")
    }

    constructor() : this(5, 9) {
        println("secondary constructor :Point 2D")
    }

    constructor(xy: Int) : this(xy, xy)

    open fun show() {
        println(this)
    }


    override fun toString(): String {
        return "x=$x,y=$y"

    }
}

