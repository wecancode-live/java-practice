package in.balamt.practice.varargs;

import java.util.Arrays;
import java.util.List;

import in.balamt.practice.util.JavaPracticeUtils;

public class SafeVarArgsApp {

	public static void main(String[] args) {
		SafeVarArgsApp.varArgsOfGeneric(Arrays.asList("Hello", "World"));
	}

	// int... args is nothing but the variable arguments (varArgs)
	// Which has warning, mouse over args will show the compiler warning. "Type safety: Potential heap pollution via varargs parameter args"
	// To overcome this we have to use the safeVarArgs annotation.
	@SafeVarargs
	private static void varArgsOfGeneric(List<String>... args) {
//		Object[] objArray = args;
//		List<Integer> intList = new ArrayList<Integer>();
//		intList.add(1);
//		objArray[0] = intList;
		String firstElem = args[0].get(0);
		JavaPracticeUtils.printLine(firstElem);
	}

}
