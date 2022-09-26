package adapter;
//시럽을 추가하는 클래스를 만든 것이 아니라 어댑터 클래스를 만들어서 기존 코드(아메리카노 클래스)를 그대로 활용, 커피와 타입 일치시키자
public class AmericanoAdapter implements Coffee{

	//생성자 만듦
	private Americano americano; //컴퍼지션으로 생성자 주입받음 -> 아메리카노를 재사용

	
	public AmericanoAdapter(Americano americano) {
		this.americano = americano;
	}


	@Override
	public String make() {	// make 할 때 아메리카노의 make가 실행 되어야 한다 <- 기존 코드 활용
		System.out.println("시럽추가");
		return americano.make();
	}	
}
// =>  기존 클래스를 변경하지 않고 기존 클래스의 기능 활용!!