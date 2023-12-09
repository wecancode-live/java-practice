package in.balamt.practice.funinterface;

import in.balamt.practice.util.JavaPracticeUtils;

public class FunctionalInterfaceApp {

    public static void main(String[] args) {
        // Simple print operation happening with the help of JavaPracticeUtils.printLine method
        FunInterfaceApp fApp = (data) -> {
            JavaPracticeUtils.printLine(data);
        };

        // Passing the method reference of printLine from JavaPracticeUtils class.
        FunInterfaceApp fApp1 = JavaPracticeUtils::printLine;

        /**
         * Both the above statements are doing the same operations,
         * It just that we have followed 2 different syntax to perform it.
         */

        fApp.print("Hello");
        fApp1.print("World");

    }

}
