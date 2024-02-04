package in.balamt.practice.funinterface;

import in.balamt.practice.util.JavaPracticeUtils;

public class GreetingApp {

    public static void main(String[] args) {

        /**
         * Using Class object to call sayHello
         */
        Greeting hello = new GreetingImpl();
        hello.sayHello();

        /**
         * Using Anonymous class implementation
         */
        Greeting helloBob = new Greeting() {
            @Override
            public void sayHello() {
                JavaPracticeUtils.printLine("Hello Bob");
            }
        };
        helloBob.sayHello();

        /**
         * Using Lambda
         */
        Greeting helloGreeting = () -> {
            JavaPracticeUtils.printLine("Hello Greeting");
        };


        helloGreeting.sayHello();
    }
}
