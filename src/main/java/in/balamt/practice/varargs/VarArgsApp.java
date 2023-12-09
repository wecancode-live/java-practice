package in.balamt.practice.varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import in.balamt.practice.util.JavaPracticeUtils;

public class VarArgsApp {

	public static void main(String[] args) {
		VarArgsApp.varArgsOfGeneric(Arrays.asList("Hello", "World"));
	}

	// int... args is nothing but the variable arguments (varArgs)
	private static void varArgsOfGeneric(List<String>... args) {
		String firstElem = args[0].get(0);
		JavaPracticeUtils.printLine(firstElem);
	}

}
