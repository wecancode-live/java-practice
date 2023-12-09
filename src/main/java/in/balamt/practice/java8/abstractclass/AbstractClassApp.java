package in.balamt.practice.java8.abstractclass;

public class AbstractClassApp {

	public static void main(String[] args) {
		Bird chick = new Chicken();
		Bird kiwi = new Kiwi();

		chick.fly();
		chick.layEggs();
		chick.walk();

		kiwi.run();
		kiwi.layEggs();
		kiwi.walk();
	}

}
