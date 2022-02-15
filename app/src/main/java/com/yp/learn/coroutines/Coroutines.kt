package com.yp.learn.coroutines

import kotlinx.coroutines.*

/**
 * @author: yp
 * @date: 2022/1/29
 * @version:
 * @description: 协程
 */

class Coroutines {

}

fun main() {
    println("${5.hasFlag(2)}, ${5.hasFlag(0)}")
    println("${5 and 1}")
//    runBlocking {
//        GlobalScope.launch {
//            repeat(2000) { i ->
//                println("repeat--->$i")
//                delay(1000)
//            }
//        }
//        doWorld()
//    }
}

suspend fun doWorld() {
//    delay(6000)
    println("world")
}

fun Int.hasFlag(flag: Int): Boolean {

    return this and flag == flag
}