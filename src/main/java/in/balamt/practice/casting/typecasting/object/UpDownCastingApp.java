package in.balamt.practice.casting.typecasting.object;

import in.balamt.practice.util.JavaPracticeUtils;

public class UpDownCastingApp {

    public static void main(String[] args) {
        new UpDownCastingApp().temp(args);
    }
    public void temp(String[] args) {
        //Up casting - giving parent reference from child class object is called Up casting (Line 13 only)
        //Down casting - giving parent obj reference to child reference by explicit casting is called Down casting (Line 13 and 14)
        Parent p = new Child();
        Child c = (Child) p;

        p.method1();
        c.method1();

    }

    class Parent {
        public void method1(){
            JavaPracticeUtils.printLine("Parent method1");
        }
    }

    class Child extends Parent {
        public void method1(){
            JavaPracticeUtils.printLine("Child method1");
        }
    }

}
