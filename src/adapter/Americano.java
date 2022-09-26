package adapter;

public class Americano implements Coffee{		
	
	private final String NAME = "아메리카노"; 	// final로 정의한 변수는 대문자로 해주자
	
	@Override	// 재정의 된 것
	public String make() {
		//System.out.println("시럽 추가"); // 본코드 OCP 위배 -> 어댑터를 쓰자
		return NAME;
	}
}
