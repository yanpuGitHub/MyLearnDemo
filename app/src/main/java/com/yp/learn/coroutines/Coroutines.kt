package com.yp.learn.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow

/**
 * @author: yp
 * @date: 2022/1/29
 * @version:
 * @description: 协程
 */
fun main() {
    println("${5.hasFlag(2)}, ${5.hasFlag(0)}")
    println("${5 and 1}")
    runBlocking {
//        doWorld()
//        isActive()
        launch {
            for (k in 1..3) {
                println("I'm not blocked $k")
                delay(1000)
            }
        }
        simple().collect {
            println("simple: $it")
        }
    }

}

//sampleStart
fun simple(): Flow<Int> = flow { // 流构建器
    for (i in 1..3) {
        delay(3000) // 假装我们在这里做了一些有用的事情
        emit(i) // 发送下一个值
    }
}

suspend fun isActive() {
    val startTime = System.currentTimeMillis()
    println("job: I'm sleeping $startTime")
    val job = CoroutineScope(Dispatchers.IO).launch {
        var nextPrintTime = startTime
        var i = 0
        while (isActive) { // 可以被取消的计算循环
            // 每秒打印消息两次
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        }
    }
//    delay(1300L) // 等待一段时间
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // 取消该作业并等待它结束
    println("main: Now I can quit.")

}

suspend fun coroutine() {
    val launch = CoroutineScope(Dispatchers.IO).launch {
        var count = 0
        while (count < 50) {
            println("repeat--->${count++}")
//                delay(100)
//                if (count == 30) {
//                    cancel()
//                }
        }
    }
    launch.cancelAndJoin()
}

suspend fun global() {
    val job = GlobalScope.launch {
        repeat(100) { i ->
            println("repeat--->$i")
//                delay(100)
        }
    }
    job.cancelAndJoin()
}

suspend fun doWorld() {
//    delay(6000)
    println("world")
}

fun Int.hasFlag(flag: Int): Boolean {

    return this and flag == flag
}

fun forEach() {
    run outside@{
        (0..10).forEachIndexed { index, i ->
            if (index == 1) {// continue
                return@forEachIndexed
            }
            if (index == 3) {// break
                return@outside
            }
            println("forEachIndexed: run: $index")
        }
    }
}