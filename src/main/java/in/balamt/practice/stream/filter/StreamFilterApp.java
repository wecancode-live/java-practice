package in.balamt.practice.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterApp {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();

		names.add("Bob");
		names.add("John");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				names.add(names.get(0) + "" + i);
			} else {
				names.add(names.get(1) + "" + i);
			}
		}

		System.out.println("Filter name having odd numbers only");
		System.out.println("\tnames.stream().map(s -> s.toString()).collect(Collectors.joining(\"*\"));");
		names.stream().filter(StreamFilterApp::isOddName).forEach(System.out::println);
		System.out.println("End of Joining * after the name\n");

	}

	private static boolean isOddName(String name) {
		int[] iarr = { 1, 3, 5, 7, 9 };
		for(int i : iarr) {
			return name.endsWith(Integer.toString(i));
		}
		return false;
	}

}
