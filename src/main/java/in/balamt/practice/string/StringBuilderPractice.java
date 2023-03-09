package in.balamt.practice.string;

public interface StringBuilderPractice {
	
	Boolean isPalindromeX(String inputText);
	
	static Boolean isPalindrome(String inputText) {
		if(inputText == null)
			return Boolean.FALSE;
		StringBuilder sb = new StringBuilder(inputText);
		return sb.reverse().toString().equals(inputText);
	}
	
	

}
