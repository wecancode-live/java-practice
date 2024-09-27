package in.balamt.practice.coding.challenges.matchingbrackets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class MatchingBracketsUsingStreamsApp {

    public static void main(String[] args) {
// Capture start time
        long startTime = System.nanoTime();
        String input = "{}([]){}{}{}{}{}()()()[][][][][]";
        AtomicBoolean match = new AtomicBoolean(false);
        String[] iArr = input.split("");
        Map<String, Integer> aMap = new HashMap<>();

        if(iArr.length%2 == 0){
            match.set(true);
        }else{
            Arrays.stream(iArr).sorted().peek(
                    s -> aMap.merge(s, 1, Integer::sum)
            ).forEach(System.out::print);

            match.set(isMatchingBracketFound(aMap, new String[]{"[","]"})
                    && isMatchingBracketFound(aMap, new String[]{"{","}"})
                    && isMatchingBracketFound(aMap, new String[]{"(",")"}));
        }

        if(match.get()){
            System.out.println("Matched");
        }else {
            System.out.println("Not Matched");
        }

        //System.out.println(checkMatchingBrackets(input));
        long endTime = System.nanoTime();

        // Calculate execution time in milliseconds
        long executionTimeInMillis = (endTime - startTime) / 1000000;
        System.out.println(executionTimeInMillis + " execution time");
    }
    public static boolean isMatchingBracketFound(Map<String, Integer> input, String[] brackets) {
        return (brackets.length == 2 && (Objects.equals(input.get(brackets[0]), input.get(brackets[1]))));
    }
}
