package adapter;

public class CoffeeMachine   {	// 커피머신은 커피에게 의존한다
	public void brew(Coffee coffee) {	
		System.out.println(coffee.make());
	}
}
//주입 받는 방법
//1.상속 - 다형성 성립x 
// 2. 컴퍼지션-생성자로 주입받는다 
// 3. 메소드로 주입받자