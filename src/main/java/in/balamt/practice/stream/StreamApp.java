package in.balamt.practice.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApp {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Bala");
		names.add("Kumar");

		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				names.add(names.get(0) + "" + i);
			} else {
				names.add(names.get(1) + "" + i);
			}
		}

		System.out.println("Joining * after the name");
		System.out.println("\tnames.stream().map(s -> s.toString()).collect(Collectors.joining(\"*\"));");
		System.out.println(names.stream().map(String::toString).collect(Collectors.joining("*")));
		System.out.println("End of Joining * after the name\n");

		System.out.println("forEach Stream");
		System.out.println("\tnames.stream().forEach(System.out::println);");
		names.stream().forEach(System.out::println);
		System.out.println("End of forEach Stream\n");

		System.out.println("Sorted Stream");
		System.out.println("\tnames.stream().sorted().forEach(System.out::println);");
		names.stream().sorted().forEach(System.out::println);
		System.out.println("End of Sorted Stream\n");

		System.out.println("Stream Sorted in Reverse order ");
		System.out.println("\tnames.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);");
		names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("End of Stream Sorted in Reverse order\n");

		System.out.println("Non matching items in Stream");
		System.out.println("\tSystem.out.println(names.stream().noneMatch(name -> name.equals(\"kumar\")));");
		System.out.println(names.stream().noneMatch(name -> name.equals("kumar")));
		System.out.println("End of Non matching items in Stream\n");

		System.out.println("Skip 3 items and get 3 items from Stream");
		System.out.println("\tnames.stream().skip(3).limit(3).forEach(System.out::println);");
		names.stream().skip(3).limit(3).forEach(System.out::println);
		System.out.println("Skip 3 items and get 3 items from Stream\n");

	}

}
