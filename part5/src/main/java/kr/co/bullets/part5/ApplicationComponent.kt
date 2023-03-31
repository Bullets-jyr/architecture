package kr.co.bullets.part5

import dagger.Component

// 컴포넌트 구현
// 컴포넌트를 구현하게되면 이 컴포넌트를 토대로 해서 Injector라는게 생성이 됨
@Component
interface ApplicationComponent {

    // 여기서 최소한으로 필요한 것은 뭐냐면 inject 메소드를 정의해주는 것
    // 이 inject 메소드는 dagger로 생성될 수 없는 클래스에서 dagger로 의존성 주입을 하기 위해서
    // 기본적으로 첫 시작점이 되는 어딘가에서는 dagger로 생성될 수 없기 때문에 왜냐하면 application, activity, fragment(예외일 수 있음) 전부 다 OS에서 생성하기 때문에
    // dagger가 생성할 수는 없는 일이다.
    // 기본적으로 의존성 주입이 되는 단초가 되는 곳은 역시 application, activity이기 때문에 inject라고해서 어디에 주입된다? 어떻게 주입된다?라고 하는 거를 한 군데는 지정할 필요가 있음
    fun inject(activity: MainActivity)
}