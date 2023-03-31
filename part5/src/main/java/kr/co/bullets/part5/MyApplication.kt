package kr.co.bullets.part5

import android.app.Application

class MyApplication : Application() {

    // pulic
    val appComponent = DaggerApplicationComponent.create()
}