package com.yp.learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycleScope
        coroutine()
        GlobalScope.launch(Dispatchers.Main) {
          val one = async { 1 }
        }
    }

    private fun coroutine(){
       CoroutineScope(Dispatchers.Main).launch(Dispatchers.Main, CoroutineStart.DEFAULT) {
           Log.e("TAG", "coroutine: ${Thread.currentThread().name}" )
       }
    }
}