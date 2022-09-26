package adapter.ex01;

// 고객의 클레임이 들어오면,
// 사과 이메일을 보내기, 
// 이메일 답장을 DB 저장하기
// 클레임과 이메일 보내는 행위는 메소드(동사는 메소드)
public class CustomerService {
//이메일어댑터의 부모이면서 이메일의 부모인 send를 걸어준다
	private EmailSend email;
	
	public CustomerService(EmailSend email) {
		this.email = email;
	}

	public void acceptClaim(String msg) { // 클레임 받는 메소드
		String acceptMsg = msg;
		System.out.println("클레임 내용 : " + acceptMsg);
		sendEmail();
	}
	
	public void sendEmail() {
		String result = email.send();
		insertResultEmail(result);
	}
	
	public void insertResultEmail(String result) {
		System.out.println("답장을 디비에 저장했습니다." + result);
	}
}
