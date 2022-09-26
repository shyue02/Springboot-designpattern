package lamun;

public class JinLamunAdapter implements Lamun{

	private JinLamun jinLamun;
	

	
	public JinLamunAdapter(JinLamun jinLamun) {
		this.jinLamun = jinLamun;
	}


	@Override
	public String make() {	// make 할 때 라면의 make 가 실행
		System.out.println("계란추가");
		return jinLamun.make();
	}
	
	

	
}