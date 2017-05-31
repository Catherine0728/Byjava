package com.example

/**
 * Created by catherine on 17/5/22.
 */

public class Point3D : Point2D {
    //构造函数不会被继承
    var z: Int

    //每一个构造函数都必须初始化所有的成员变量
    constructor(x: Int, y: Int, z: Int) : super(x, y) {
        this.z = z
        println("secondary constructor :point 3D")
    }

    //如果不显示调用super，则会自动调用super（）
    constructor(xyz: Int)/*r:super()*/ {
        this.x = xyz
        this.y = xyz
        this.show()
        this.z = xyz

    }

    //如果不显示调用super，则会自动调用super（）
    constructor(xy: Int, z: Int)/*r:super()*/ {
        this.x = xy
        this.y = xy
        this.z = z
        this.show()

    }

    constructor() : this(2, 3, 4)
    //使用override重写父类函数
    //必须是public,子类重写父类函数不可以降低函数可视性

    public override fun show() {
        println("Point 3d is[" + this + "]")
    }

    override fun toString(): String {
        return super.toString() + ",z=$z"
    }


}

fun main(args: Array<String>) {
    println("---------------------")
    val p = Point2D()
    p.show()
    println("---------------------")
    val p1 = Point2D(1, 1)
    p1.show()
    println("---------------------")
    val p2 = Point2D(2)
    p2.show()
    println("---------------------")
    val p3 = Point3D(3)
    p3.show()
    println("---------------------")
    val p4 = Point3D(1, 2, 3)
    p4.show()
    println("---------------------")

}