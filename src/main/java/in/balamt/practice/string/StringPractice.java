package in.balamt.practice.string;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface SBInterface {
	//public Boolean isPalindromeX(String inputText);
	public Boolean isPalindromeX(String inputText,Boolean ignoreCase);
}

public class StringPractice {
	
	
	public static void main(String[] args) {
		//Lambda implementation of the isPalindrome method
		SBInterface sbi = (String input, Boolean ignoreCase) -> {
			if (input == null)
				return Boolean.FALSE;
			StringBuilder sb = new StringBuilder(input);
			if(ignoreCase)
				return sb.reverse().toString().equalsIgnoreCase(input);
			return sb.reverse().toString().equals(input);
		};

		System.out.println("null is Palindrome " + sbi.isPalindromeX(null, false));
		System.out.println("Bala is Palindrome " + sbi.isPalindromeX("BALA", true));
		System.out.println("Malayalam is Palindrome "  + sbi.isPalindromeX("Malayalam", true));
		
		List<String> names = new ArrayList<String>();
		
		names.add("Bala");
		names.add("malayalam");
		names.add("balaalab");
		names.add("123321");
		names.add("Madam");
		
		for (String name : names) {
			System.out.println(name + " is Palindrome " + sbi.isPalindromeX(name, false));
		}
		

	}

}
