package in.balamt.practice.integers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * We extract the number from the given String array/lsit
 * We follow simple RegEx in string replaceAll method.
 * 1. \\D+
 * 2. [^0-9]
 * and we use the Character.isDigit to check the individual character and extract the number
 */
public class ExtractNumberFromStringApp {
    //https://stackoverflow.com/questions/14974033/extract-digits-from-string-stringutils-java
    public static void main(String[] args) {

        String[] data = new String[]{
                "Hello1", "World12", "23", "Good90"," 23 23 12"," 2.1", "9c9d0s", "+60-908-9700"
        };

        List<String> testInput = new ArrayList<String>();
        //Convert the String Array to List/Collection using the Arrays Class
        testInput.addAll(Arrays.asList(data));

        System.out.println("==== Below we use the RegExp [^0-9] ================================");

        /**
         * We can use the regular expressing [^0-9] to the replaceAll method of String class
         */
        testInput.forEach(s -> {
            String res = s.replaceAll("[^0-9]","");
            System.out.println(res);
        });
        System.out.println("==== Below we use the RegExp \\\\D+ ================================");

        /**
         * We can use the regular expressing \\D+ to the replaceAll method of String class
         */
        testInput.forEach(s -> {
            String res = s.replaceAll("\\D+","");
            System.out.println(res);
        });

        System.out.println("==== Below we use IsDigit method from the Character.class  =====================");

        List<Integer> finalOutput = new ArrayList<>();
        for (String datum : data) {
            Integer out = IntegerHelper.getInteger(datum);
           finalOutput.add(out);
            System.out.println(String.format("Extracted number is %d", out));
        }

    }

    public static class IntegerHelper {

        public static Integer getInteger(String input){
            char[] inputArr = input.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (char iChar : inputArr) {
                if(Character.isDigit(iChar)){
                    sb.append(iChar);
                }
            }

            return Integer.parseInt(sb.toString());
        }

    }

}

