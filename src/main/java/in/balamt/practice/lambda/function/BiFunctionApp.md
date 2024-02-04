# BiFunction

BiFunction which accepts 2 input and return 1 output.

i.e BiFunction<T, U, R>

Where T - Input Type 1
Where U - Input Type 2
Where R - Return Type


```java

BiFunction<float, float, float> add = (a, b) -> a + b;
BiFunction<float, float, float> multiply = (a, b) -> a * b;

System.out.println("Add " + add.apply(2, 5));

System.out.println("Multiply " + multiply.apply(2, 5));

// Output
// Add 7
// Multiply 10

```

