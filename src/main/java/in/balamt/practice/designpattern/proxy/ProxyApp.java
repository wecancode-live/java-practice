package in.balamt.practice.designpattern.proxy;

public class ProxyApp {

	public static void main(String[] args) {
		Cards card = new DebitCard();
		try {
			card.processCard("4321");
			card.processCard("4123");
			card.processCard("4221");					
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
