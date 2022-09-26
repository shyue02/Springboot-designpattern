package lamun;

public class App {
	
	public static void main(String[] args) {
	Cook c = new Cook();
	c.cook(new JinLamun());
	c.cook((new JinLamunAdapter(new JinLamun())));
	}

}