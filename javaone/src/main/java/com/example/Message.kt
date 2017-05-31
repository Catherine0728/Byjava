package com.example


/**
 * Created by catherine on 2017/5/24.
 */
class Message {

    companion object {
        public val MSG_NO_MSG: Int = -1
        public val MSG_RESUME: Int = 0
        public val MSG_REFRESH: Int = 1
        public val MSG_DESTROY: Int = 2
        public val MSG_EXIT: Int = 3
        val MSG_MIN_VAL: Int = -1
        val MSG_MAX_VAL: Int = 6

//        platformStatic
//        val MSG_MAX_VAL: Int = 6
    }

//    public var what: Int
//        set(value) {
//            if (value < Message.MSG_MIN_VAL || value > Message.MSG_MAX_VAL) {
//                $what = MSG_NO_MSG;
//
//            } else {
//                $what= value
//            }
//        }


}