package in.balamt.practice.string;

public interface StringBuilderPractice {
	
	public Boolean isPalindromeX(String inputText);
	
	public static Boolean isPalindrome(String inputText) {
		if(inputText == null)
			return Boolean.FALSE;
		StringBuilder sb = new StringBuilder(inputText);
		return sb.reverse().toString().equals(inputText);
	}
	
	

}
