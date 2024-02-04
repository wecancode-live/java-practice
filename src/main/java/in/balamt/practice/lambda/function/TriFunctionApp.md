# TriFunction

TriFunction which accepts 3 input and return 1 output.
This is purely custom function written to accept 3 input.

i.e TriFunction<T, U, V, R>

Where T - Input Type 1
Where U - Input Type 2
Where V - Input Type 3
Where R - Return Type


```java

TriFunction<float, float, float, float> add = (a, b, c) -> a + b + c;
TriFunction<float, float, float, float> multiply = (a, b, c) -> a * b * c;

System.out.println("Add " + add.apply(2, 5, 1));
System.out.println("Multiply " + multiply.apply(2, 5, 1));

// Output
// Add 8
// Multiply 10

```

