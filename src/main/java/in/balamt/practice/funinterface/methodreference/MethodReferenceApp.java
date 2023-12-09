package in.balamt.practice.funinterface.methodreference;

import in.balamt.practice.util.JavaPracticeUtils;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceApp {
    public static void main(String[] args) {

        //lambda using the interface method and its implementation is written within the lambda expression.
        ArithmeticOperation operation = (a,b) -> {
        int sum = a+b;
        JavaPracticeUtils.printLine("Addition using ArithmeticOperation interface ", sum);
        return sum;
        };
        operation.performOperation(2,5);

        /*
        Static Method Reference example
         */
        // Method referencing to the MethodReferenceApp.performAddition method.
        ArithmeticOperation methodRef = MethodReferenceApp::performAddition;
        methodRef.performOperation(3,5);

        // Method referencing to the MethodReferenceApp.performSubtraction method.
        ArithmeticOperation methodRefDif = MethodReferenceApp::performSubtraction;
        methodRefDif.performOperation(6,3);


        /*
            ObjectRef Method Reference example
         */
        //Creating object for MethodReferenceApp class
        MethodReferenceApp omRef = new MethodReferenceApp();

        // Method referencing to the instance of omRef object to call performInstanceAddition method.
        ArithmeticOperation objRef = omRef::performInstanceAddition;
        objRef.performOperation(2,9);

        // Method referencing to the instance of omRef object to call performInstanceSubtraction method.
        ArithmeticOperation objRefDif = omRef::performInstanceSubtraction;
        objRefDif.performOperation(8,3);

        JavaPracticeUtils.printLine("Class Type Reference Example");
        MethodReferenceApp.classTypeReferenceExample();
    }

    public static void classTypeReferenceExample(){
        List<String> fruites = new ArrayList<>();
        fruites.add("Apple");
        fruites.add("PineApple");
        fruites.add("CustardApple");

        fruites.forEach(s -> System.out.println(s));
        JavaPracticeUtils.printLine("Using the Class Type reference to call println method within the System.out");
        fruites.forEach(System.out::println);

    }

    public static int performAddition(int a, int b){
        int sum = a+b;
        JavaPracticeUtils.printLine("Addition using performAddition method ", sum);
        return sum;
    }

    public int performInstanceAddition(int a, int b){
        int sum = a+b;
        JavaPracticeUtils.printLine("Addition using performInstanceAddition method ", sum);
        return sum;
    }

    public static int performSubtraction(int a, int b){
        int dif = a-b;
        JavaPracticeUtils.printLine("Addition using performSubtraction method ", dif);
        return dif;
    }

    public int performInstanceSubtraction(int a, int b){
        int dif = a-b;
        JavaPracticeUtils.printLine("Addition using performInstanceSubtraction method ", dif);
        return dif;
    }
}
