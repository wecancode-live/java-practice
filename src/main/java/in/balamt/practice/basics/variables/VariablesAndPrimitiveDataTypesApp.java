package in.balamt.practice.basics.variables;

import in.balamt.practice.util.JavaPracticeUtils;

public class VariablesAndPrimitiveDataTypesApp {
    public static void main(String[] args) {

        /**
         * datatype
         *  1. Primitive - The most basic variable types are called primitives.
         *      a. byte - Can store any number between -128 to 127
         *      b. short - Can store any number between -32,768 to 32,767
         *      c. int - Can store any number between -2,147,783,648 to 2,147,483,647
         *      d. long - Can store any number between -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         *  2.
         *
         * Variable declaration or initialization
         * datatype_name variable_name = value;
         */
        int integer_whole_number = 123;
        JavaPracticeUtils.printLine("integer_whole_number :", integer_whole_number);

        int integerWholeNumber = 456;
        JavaPracticeUtils.printLine("integerWholeNumber :", integerWholeNumber);

        long long_number = 45L;
        JavaPracticeUtils.printLine("long_number :", long_number);

        long longNumber = 50000045L;
        JavaPracticeUtils.printLine("longNumber " , longNumber);

        double double_number = 25.6d;
        JavaPracticeUtils.printLine("double_number " , double_number);

        double doubleNumber = 206605.4d;
        JavaPracticeUtils.printLine("doubleNumber " , doubleNumber);

        float float_number = 95.6F;
        JavaPracticeUtils.printLine("float_number " , float_number);

        float floatNumber = 896605.234F;
        JavaPracticeUtils.printLine("floatNumber " , floatNumber);

    }
}
