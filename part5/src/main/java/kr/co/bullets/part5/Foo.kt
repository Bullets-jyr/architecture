package kr.co.bullets.part5

import android.util.Log
import javax.inject.Inject

class Foo @Inject constructor() {

    init {
        Log.i("Foo", "Hello, DI world!")
    }
}