# Method Reference

-----------------------------------------------

* Sometimes, there is already a method carries out exactly the same action that we would like to pass on inside 
lambda expression. In such case it would be nicer to pass on the method instead of duplication the code again
* This is resolved using the *Method reference* in Java 8. 
* Method references are a special type of lambda expression which are often used to create simple lambda expression by referencing existing methods.
* There are 4 types of Method references.
  * *Static Method reference* __(Class::staticMethod)__
  * *Reference to instance method from instance* __(objRef::instanceMethod)__
  * *Reference to instance method from class type* __(Class::instanceMethod)__
  * *Constructor reference* __(Class::new)__
* Java introduced a new operator __:: (double colon)__ which is called Method reference delimiter. This don't require
    us to pass any parameter to the method references.

--------------------------------------------------

Static Method Reference:

    MethodReferenceApp.java has the main method which has logic to ArithmeticOperation interface with 
    implementation of addition operation.
    
    We also Have 2 Methods within the Method reference class (performAddition and performSubtraction).
    Which perform similar operation as ArithmeticOperation.performOperation.
    
    So we Use the Method reference concept to reuse the existing methods within the MethodReferenceApp class.

--------------------------------------------------------

Object Instance Method reference :

    In MethodReferenceApp class we have created object for the MethodReferenceApp "omRef", 
    Which is used as Method Instance reference by calling the performInstanceAddition and performInstanceSubtraction. 
    This method is not static method and that is the reason we have to create object reference for the class and
    make call to those instance method reference.

--------------------------------------------------------

Class method reference:

    We use example of printing array list one by one using the System.out.println() method.
    Here we use the reference of instance method using System.out::println
    Which is the reference of class method reference of println within System class on out variable.

--------------------------------------------------------

Constructor reference:

    TODO: find better example for Constructor reference.

    
    

