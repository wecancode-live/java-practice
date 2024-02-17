package in.balamt.practice.coding.challenges.thirdlargest;

import in.balamt.practice.util.JavaPracticeUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdLargestNoInArrayApp {
    public static void main(String[] args) {
        int[] input = {1,2,3,6,3,8,9,19};

        //Sort the list and collect the sorted value as list.
        List<String> yy = Arrays.stream(input).sorted().mapToObj(String::valueOf).collect(Collectors.toList());

        //Finding the 3rd largest number in array.
        JavaPracticeUtils.printLine("3rd Last item in the array is ", yy.get(input.length - 3));

        yy.forEach(JavaPracticeUtils::printLine);

    }
}
