package in.balamt.practice.basics.loops;

import in.balamt.practice.util.JavaPracticeUtils;

public class WhileLoopsApp {

    public static void main(String[] args) {
        int count = 0;
        String[] animals = {"cat", "dog", "cow"};

        while(count < 3){
            JavaPracticeUtils.printLine("Animal : ", animals[count]);
            count++;
        }

    }
}
