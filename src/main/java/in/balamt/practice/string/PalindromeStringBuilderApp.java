package in.balamt.practice.string;

public class PalindromeStringBuilderApp {
    public static void main(String[] args) {
        String palin = "malayalam";
       StringBuilder sb = new StringBuilder(palin);

        System.out.println(palin.equalsIgnoreCase(sb.reverse().toString()));
    }
}
