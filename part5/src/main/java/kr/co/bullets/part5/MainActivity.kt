package kr.co.bullets.part5

import android.os.Bundle
import androidx.activity.ComponentActivity
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    // 주입 구현 (여기에 주입이 될 거 다 라는 것을 의미하기도 함)
    @Inject lateinit var foo: Foo

    override fun onCreate(savedInstanceState: Bundle?) {
        // Make Dagger instantiate @Inject fields in MainActivity
        // 이 엑티비티 안에 inject라고하는 어노테이션으로 시작하는 필드가 있다고 하면, 지금 정의되어 있는 ApplicationComponent에 있는
        // dagger를 통해서 필드에 자동으로 주입이 되는 그런 형태가 이루어 지게 됩니다.
        (applicationContext as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
    }
}