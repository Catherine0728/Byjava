package com.example

/**
 * Created by catherine on 17/5/22.
 *
 * 空间线段
 */

public class Line3D : Shape3D {
    var origin_point: Point3D
    var dest_point: Point3D

    constructor(p1: Point3D, p2: Point3D) {
        this.origin_point = p1
        this.dest_point = p2
    }

    override fun toString(): String {
        var str = "Line3D=["
        str += this.origin_point.toString()
        str += "|"
        str += this.dest_point.toString()
        str += "]"
        return str
    }
}