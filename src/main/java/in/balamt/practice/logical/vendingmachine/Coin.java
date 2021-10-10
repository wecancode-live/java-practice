package in.balamt.practice.logical.vendingmachine;

public enum Coin {

	ONE(1), FIVE(5), TEN(10), TWENTY(20);

	private int amount;

	private Coin(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return this.amount;
	}

}
