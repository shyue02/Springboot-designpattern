package singleton;

public class App {

	public static void main(String[] args) {
		President p1 = President.getInstance();	// 객체를 하나만 유지하는 기법 = 싱글톤
		//President p2 = President.getInstance();	
		//President p3 = new President();	// 이미 생성자를 구현해서 new 디폴트 생성자 생성 못한다

	}

}
