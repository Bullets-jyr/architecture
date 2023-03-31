package kr.co.bullets.part5

import android.util.Log
import javax.inject.Inject

// 주입될 대상이 되는 클래스를 지정
class Foo @Inject constructor() {

    init {
        Log.i("Foo", "Hello, DI world!")
    }
}