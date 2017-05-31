package com.example.catherine.byjava.utill

import android.util.Log
import java.util.*

/**
 * Created by catherine on 2017/5/24.
 *
 * 1：如果全部是静态方法，那么就用object类名 即可
 *
 * 2：普通静态方法：一部分是静态方法的情况，将方法用Companion object{},因为Kotlin的class并不支持static变量,
 * 所以需要使用companion object来声明static变量,其实这个platformStatic变量也不是真正的static变量,而是一个伴生对象,
 * 这个伴生对象位于Message类中定义的一个叫做Companion的内部类中
 *
 */
object L {

    fun line() {
        Log.d(KeyMap.TAG, "-----------------")
    }

    fun line(str: Any) {
        Log.d(KeyMap.TAG, "-----------------" + str)
    }

    fun e(str: Objects) {
        Log.e(KeyMap.TAG, "-----------------" + str)
    }


}
