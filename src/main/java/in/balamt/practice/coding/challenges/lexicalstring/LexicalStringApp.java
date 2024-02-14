package in.balamt.practice.coding.challenges.lexicalstring;

import java.util.Arrays;

public class LexicalStringApp {
    public static void main(String[] args) {
        //Input as String array
        //String[] input = {"abc", "bac", "dbc"};
        String[] input = {"abc", "edc", "deb"};

        String output = getLexicalSortedWord(input);
        System.out.println(output);
        //Expected output
        // "aab"
        // where input[0] we take least alphabet i.e 'a'
        // where input[1] we take least alphabet i.e 'a'
        // where input[2] we take least alphabet i.e 'b'
        // Combine everything as single string.
    }

    private static String getLexicalSortedWord(String[] inputs) {
        String output = "";
        // Iterate through the words from string array
        for(String input : inputs) {
            //Split the input word into array and then convert it to List for Stream operations
            //Stream use the sort and then take the first iteam from the sorted stream.
            // Append the sorted item into output string variable.
            output += Arrays.asList(input.split("")).stream()
                    .sorted().findFirst().get();
        }

        // Sorted output is again sorted within the characters so that we get the lexical ordered output
        output = Arrays.asList(output.split("")).stream().sorted().reduce("",String::concat);



        return output;
    }
}
