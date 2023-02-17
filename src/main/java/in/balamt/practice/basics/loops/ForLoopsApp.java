package in.balamt.practice.basics.loops;

import in.balamt.practice.util.JavaPracticeUtils;

public class ForLoopsApp {

    public static void main(String[] args) {

        int[] dArray = {12, 245, 227, 56};
        JavaPracticeUtils.printLine("length of dArray: ", dArray.length);

        /**
         * For Loops
         *
         */
        for (int count = 0; count <= dArray.length; count++) {
            JavaPracticeUtils.printLine("dArray Count : ", count);
        }

        JavaPracticeUtils.printLine("Printing dArray using foreach");
        for (int doubleValue : dArray
        ) {
            JavaPracticeUtils.printLine("Double value : ", doubleValue);
        }
        JavaPracticeUtils.printLine("----------------------------------");
        JavaPracticeUtils.printLine("Printing dArray using for with counter in reverse order");

        for (int index = dArray.length-1; index >= 0; index--) {
            JavaPracticeUtils.printLine("Index : ", index);
            JavaPracticeUtils.printLine("Double value : ", dArray[index]);
        }

    }
}
