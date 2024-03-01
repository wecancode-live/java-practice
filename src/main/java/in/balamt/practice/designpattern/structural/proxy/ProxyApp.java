package in.balamt.practice.designpattern.structural.proxy;

import in.balamt.practice.util.JavaPracticeUtils;

public class ProxyApp {

	public static void main(String[] args) {
		Cards card = new DebitCard();
		try {
			card.processCard("4321");
			card.processCard("4123");
			card.processCard("4221");					
		} catch (Exception e) {
			JavaPracticeUtils.printLine(e.getMessage());
		} catch (Throwable throwable) {
			throw new RuntimeException(throwable);
		}
	}
}
