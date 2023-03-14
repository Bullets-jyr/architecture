package kr.co.bullets.part5

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import javax.inject.Inject

class MyApplication : Application() {
    val appComponent = DaggerApplicationComponent.create()
}

class MainActivity : ComponentActivity() {

    @Inject lateinit var foo: Foo

    override fun onCreate(savedInstanceState: Bundle?) {
        // Make Dagger instantiate @Inject fields in MainActivity
        (applicationContext as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
    }
}