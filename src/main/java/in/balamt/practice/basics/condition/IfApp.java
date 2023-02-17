package in.balamt.practice.basics.condition;

import in.balamt.practice.util.JavaPracticeUtils;

public class IfApp {
    public static void main(String[] args) {
        int index = 3;

        if(index <= 5){
            JavaPracticeUtils.printLine("Index is less than 5");
        }

        if(index >= 5){
            JavaPracticeUtils.printLine("Index is greater than 5");
        }
    }
}
