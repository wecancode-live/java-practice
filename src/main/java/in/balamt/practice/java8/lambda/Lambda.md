# Lambda

-----------------------------------------------

Java (1990s) is Object-oriented programming language, and it was the principal paradigm of software development.

1. **Functional Programming** has risen in importance because it is well suited for _concurrent and event-driven ("reactive") programming_.
2. Since **Java 8** we have functional programming (which is blend of Object-oriented and functional programming).
3. **Lambda Expression** is a block of code that we can pass around, so it can be executed later.
   1. It is anonymous function, which means that function doesn't have method name, return type and access modifiers.
   2. lambda is available in Python, Ruby languages already.


```java
Syntax of lambda expressions:
        
()-> { operations };
() -> operations;
(param) -> { operations }; 
(param) -> operations;
(params...) -> { return operations };
(params...) -> { operations };
(params...) -> operations;

```