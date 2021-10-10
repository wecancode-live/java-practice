package in.balamt.practice.logical.vendingmachine;

import java.util.List;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {

	Inventory inventory;
	Map<Item, Integer> inventoryItem;

	public VendingMachineImpl(Inventory inventory) {
		this.inventory = inventory;
		this.inventoryItem = inventory.getAvailableItemsInVendingMachine();
	}

	@Override
	public Bucket<Item, List<Coin>> fetchItem(Item item, int quantity, List<Coin> amount) throws ItemNotFound {
		
		if(!inventoryItem.containsKey(item)) {
			throw new ItemNotFound(String.format("%s is not available.",item.getName()));
		}else {
			
			int availableQuantity = this.inventoryItem.get(item);
			int costOfItem = (availableQuantity * item.getPrice());
			int coinInserted = VendingMachineUtil.countCoins(amount);
			
			if(availableQuantity < quantity) {
				throw new ItemNotFound(String.format("Unable to dispense the requested quantity for the item %s",item.getName()));
			}
			inventoryItem.replace(item, availableQuantity);
			
			
		}

		
		return null;
	}

	@Override
	public Map<Item, Integer> getItemsInInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory removeItemInInventory(Inventory inventory, Item item, int quantity, List<Coin> amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
