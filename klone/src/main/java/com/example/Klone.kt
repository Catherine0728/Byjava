package com.example

/**
 * Created by catherine on 17/5/22.
 */


fun sum(x: Int, y: Int): Int = x + y


fun main(args: Array<String>) {
//    println("the sum of 5 and 9 is:" + sum(5, 9))

    polymorphic()
}


fun polymorphic() {
    val p1 = Point3D(1, 2)
    println("------------------------")

    val p2 = Point3D(2, 3)
    println("------------------------")

    val p3 = Point3D(3, 4)
    val l: Shape3D = Line3D(p1, p2)
    val t: Shape3D = Triangle3D(p1, p2, p3)
    println("------------------------")
    l.show()
    println("------------------------")
    t.show()


}

