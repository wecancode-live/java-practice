package in.balamt.practice.basics.condition;

import in.balamt.practice.util.JavaPracticeUtils;

public class IfElseApp {

    public static void main(String[] args) {
        int passingScore = 80;
        int score1 = 30;
        int score2 = 99;

        if (score1 < passingScore) {
            JavaPracticeUtils.printLine("score1 < passingScore | ", score1, "<", passingScore);
            JavaPracticeUtils.printLine("Failed");
        } else {
            JavaPracticeUtils.printLine("score1 < passingScore | ", score1, "<", passingScore);
            JavaPracticeUtils.printLine("Passed");
        }

        if (score2 > passingScore) {
            JavaPracticeUtils.printLine("score2 > passingScore | ", score2, ">", passingScore);
            JavaPracticeUtils.printLine("Passed");
        } else {
            JavaPracticeUtils.printLine("score2 > passingScore | ", score2, ">", passingScore);
            JavaPracticeUtils.printLine("Failed");
        }

    }
}
