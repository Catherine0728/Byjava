package com.example

/**
 * Created by catherine on 17/5/23.
 *
 * 空间三角形类
 */

public class Triangle3D : Shape3D {
    var a: Point3D
    var b: Point3D
    var c: Point3D

    constructor(p1: Point3D, p2: Point3D, p3: Point3D) {
        this.a = p1
        this.b = p2
        this.c = p3
    }

    override fun toString(): String {
        var str = "Triangle3D=["
        str += this.a.toString()
        str += "|"
        str += this.b.toString()
        str += "|"
        str += this.c.toString()
        str += "]"
        return str
    }


}

fun main(args: Array<String>) {

}
