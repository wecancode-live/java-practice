package in.balamt.practice.logical;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SocksMerchatApp {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		Map<Integer, Integer> socksStock = new HashMap();

		for (Integer socks : ar) {
			if (socksStock.containsKey(socks)) {
				socksStock.put(socks, (socksStock.get(socks) + 1));
			} else {
				socksStock.put(socks, 1);
			}
		}

		Iterator<Map.Entry<Integer, Integer>> itr = socksStock.entrySet().iterator();
		int count = 0;
		while (itr.hasNext()) {
			count += getTotalPair(itr.next());
		}
		return count;

	}

	private static int getTotalPair(Entry<Integer, Integer> entry) {
		System.out.println("tot" + entry.getValue());
		return Math.round(entry.getValue() / 2);
	}

	public static void main(String[] args) throws IOException {
		int n = 9;
		int[] arItems = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int result = sockMerchant(n, arItems);
		
		System.out.println("Result "  + result);

	}
}
