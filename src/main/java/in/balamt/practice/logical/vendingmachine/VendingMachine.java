package in.balamt.practice.logical.vendingmachine;

import java.util.List;
import java.util.Map;

public interface VendingMachine {

	public Bucket<Item, List<Coin>> fetchItem(Item item, int quantity, List<Coin> amount) throws ItemNotFound;

	public Map<Item, Integer> getItemsInInventory(Inventory inventory);

	public Inventory removeItemInInventory(Inventory inventory, Item item, int quantity, List<Coin> amount);

}
