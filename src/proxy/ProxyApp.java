package proxy;

public class ProxyApp {
	public static void main(String[] args) {
		//BlogServer s = new BlogServer();	// 어댑터
		ProxyServer ps = new ProxyServer(new BlogServer());
		ps.request();
	}
}


// 어댑터와 코드는 거의 비슷하지만 바라보는 대상(타겟)이 다르다
// 어댑터를 보고 오는 것이고, 	ex) 커피머신을 그대로 보고 아메리카노를 호출.
// 프록시는 프록시를 보고 오는 것이다