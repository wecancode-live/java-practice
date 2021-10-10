package in.balamt.practice.logical.vendingmachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

	private static List<Coin> amountIn;
	private static List<Item> items;

	static {
		amountIn = new ArrayList();
		items = new ArrayList();

		for (int i = 0; i < 20; i++) {
			amountIn.add(Coin.ONE);
			items.add(Item.PEPSI);
		}

		for (int i = 0; i < 3; i++) {
			amountIn.add(Coin.TEN);
			items.add(Item.COKE);
		}

		for (int i = 0; i < 2; i++) {
			amountIn.add(Coin.TWENTY);
		}

		for (int i = 0; i < 9; i++) {
			amountIn.add(Coin.FIVE);
			items.add(Item.SODA);
		}
	}

	private Inventory() {
	}

	private static final Inventory instanse = new Inventory();

	public static final Inventory getInstanse() {
		return instanse;
	}

	private List<Item> getItem() {
		return items;
	}

	public List<Coin> getAmount() {
		return amountIn;
	}

	public Map<Item, Integer> getAvailableItemsInVendingMachine() {
		Map<Item, Integer> itemInVM = new HashMap();

		for (Item i : getItem()) {
			if (itemInVM.get(i) != null) {
				itemInVM.put(i, itemInVM.get(i) + 1);
			} else {
				itemInVM.put(i, 1);
			}
		}
		return itemInVM;
	}

}
