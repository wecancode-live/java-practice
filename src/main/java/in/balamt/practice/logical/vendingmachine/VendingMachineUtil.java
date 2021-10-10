package in.balamt.practice.logical.vendingmachine;

import java.util.List;

public class VendingMachineUtil {

	public static int countCoins(List<Coin> amount) {
		int total = 0;
		for(Coin c : amount) {
			total = total + c.getAmount();
		}
		return total;
	}

}
