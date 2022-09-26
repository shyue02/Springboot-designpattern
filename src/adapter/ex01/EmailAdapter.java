package adapter.ex01;

//가짜 객체
public class EmailAdapter implements EmailSend{

	@Override
	public String send() {
		
		return "가짜내용 넣어준다";
	}

}
