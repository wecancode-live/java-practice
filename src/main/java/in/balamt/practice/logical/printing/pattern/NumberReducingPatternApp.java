package in.balamt.practice.logical.printing.pattern;

import in.balamt.practice.util.JavaPracticeUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberReducingPatternApp {


    /**
     * Need to print the following pattern
     *
     * 5
     * 54
     * 543
     * 5432
     * 54321
     *
     * @param args
     */
    public static void main(String[] args) {

       int n = 9;
       int length = 1;
       List<Integer> numberPatternItems = new ArrayList<>();

       for(int i=n; i>0;i--){
           numberPatternItems.add(listRangeInReverse(n,length));
           length++;
       }

       //This line actually reverse the entire list, so that the expected number pattern is printed
       Collections.reverse(numberPatternItems);

        for(Integer x: numberPatternItems){
            JavaPracticeUtils.print(x);
        }

    }


    private static Integer listRangeInReverse(int k, int count) {
        StringBuilder sb = new StringBuilder();
        for (int c = k; c >=count;c--){
            sb.append(c);
        }
        return Integer.parseInt(sb.toString());
    }



}
