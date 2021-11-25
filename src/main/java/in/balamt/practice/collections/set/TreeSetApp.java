package in.balamt.practice.collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetApp {
	
	public static void main(String[] args) {
		HashSet<String> startSet = new HashSet<String>();
		startSet.add("**");
		startSet.add("*");
		startSet.add("***");
		startSet.add("****");
		startSet.add("*");
		
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.addAll(startSet);
		
		for(String s : tSet) {
			System.out.println(s);
		}

		System.out.println("\n");
		//Stream way of sorting the HashSet
		startSet.stream().sorted().forEach(s -> System.out.println(s));
		
		//Stream way of sorting the HashSet and sorting in reverse order
		startSet.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
