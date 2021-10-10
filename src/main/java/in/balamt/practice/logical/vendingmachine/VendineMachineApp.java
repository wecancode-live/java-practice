package in.balamt.practice.logical.vendingmachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class VendineMachineApp {

	/**
	 * Problem Statement You need to design a Vending Machine which Accepts coins of
	 * 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter. Allow user to select
	 * products Coke(25), PEPSI(35), Soda(45) Allow user to take refund by canceling
	 * the request. Return selected product and remaining change if any Allow reset
	 * operation for vending machine supplier.
	 * https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<Coin> insertCoins = new ArrayList();

		insertCoins.add(Coin.TEN);
		insertCoins.add(Coin.TWENTY);

		Item vendItemCoke = Item.COKE;
		int quantity = 1;

		Inventory inventory = Inventory.getInstanse();

		Map<Item, Integer> availableItems = inventory.getAvailableItemsInVendingMachine();

		for (Entry entry : availableItems.entrySet()) {
			System.out.println(String.format(" %s\t|[%d]", entry.getKey(), entry.getValue()));
		}

	}

}
