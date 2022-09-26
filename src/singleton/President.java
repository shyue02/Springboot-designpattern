package singleton;

public class President {

	private static President instance = new President("윤석열");
	
	public static President getInstance() {	// static 안 붙으니까 heap 에 뜬다. -> static을 붙여주자!
		return instance;
	}
	
	private String name;

	private President(String name) {	//컨트롤스페이스->생성자
		this.name = name;
	}
}
