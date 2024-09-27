package in.balamt.practice.funinterface;

import in.balamt.practice.util.JavaPracticeUtils;

/**
 * A functional interface in Java is an interface that contains only a single abstract
 * (unimplemented) method. A functional interface can contain default and static methods which
 * do have an implementation, in addition to the single unimplemented method.
 */
@FunctionalInterface
public interface FunInterfaceApp {

    void print(String msg);

    static void main(String[] args) {
        JavaPracticeUtils.printLine("Print from FunInterfaceApp which is an Interface type.");
    }

}
