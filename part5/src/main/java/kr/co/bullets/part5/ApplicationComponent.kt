package kr.co.bullets.part5

import dagger.Component

// 컴포넌트 구현
// 컴포넌트를 구현하게되면 이 컴포넌트를 토대로 해서 Injector라는게 생성이 됨
@Component
interface ApplicationComponent {

    // 여기서 최소한으로 필요한 것은 뭐냐면 inject 메소드를 정의해주는 것
    fun inject(activity: MainActivity)
}