package strategy;

public class CafeLatte implements Coffee{
	
	private final String NAME = "카페라떼"; 	// final로 정의한 변수는 대문자로 해주자
	
	@Override
	public String make() {
		return NAME;
	}
}
