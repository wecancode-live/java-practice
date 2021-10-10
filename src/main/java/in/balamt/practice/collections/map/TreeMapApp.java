package in.balamt.practice.collections.map;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Sorting of HashMap Naturally, we can use TreeMap
 */
public class TreeMapApp {
	// https://www.callicoder.com/java-treemap/
	// https://www.geeksforgeeks.org/sorting-hashmap-according-key-value-java/
	public static void main(String[] args) {
		SortedMap<String, String> sMap = new TreeMap();

		sMap.put("java", ".java");
		sMap.put("python", ".py");
		sMap.put("c++", ".cpp");
		sMap.put("textfile", ".txt");

		System.out.println(sMap);

		SortedMap<String, Integer> ageMap = new TreeMap(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}

		});

		ageMap.put("Harry", 21);
		ageMap.put("William", 32);
		ageMap.put("Jesus", 11);

		System.out.println(ageMap);

	}

}
