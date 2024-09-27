package in.balamt.practice.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		String data = "DO NOT FORGET TO WRITE YOUR NAME ON THE ANSWER SCRIPTS";


		/**
		 * For each Loop
		 */
		for (Character c : data.toCharArray()) {
			if (charMap.get((c)) != null) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}

		/**
		 * For each Loop with entrySet
		 */
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			System.out.println(
					String.format("\t %s Char Count : %d", entry.getKey(), entry.getValue()));
		}

		/**
		 * Iterating with While loop
		 */
		Iterator<Character> iterator = charMap.keySet().iterator();
		while (iterator.hasNext()){
			Character key = iterator.next();
			System.out.println(
					String.format("@@ %s Char Count : %d", key, charMap.get(key)));
		}


		/**
		 * Getting only the Value from the Hashmap as Collection Items
		 */
		Collection<Integer> items = charMap.values();
		for(Integer i : items){
			System.out.println(
					String.format("__ Count : %d", i));
		}

		/**
		 * forEach method of the HashMap Class
		 */
		charMap.forEach((character, integer) -> {
			System.out.println(
					String.format("-- %s Char Count : %d", character, integer));
		});


	}


}
