# No Arg Function

No Arg Function which had NO input and return 1 output.
This is purely custom function written to return only 1 return without any arguments.

i.e NoArgFunction<R>

Where R - Return Type


```java
NoArgFunction<R> sayhello = () -> "Hello!!";
        
System.out.println("Say Hello " + sayhello.apply());

// Output
// Say Hello Hello!!

```

