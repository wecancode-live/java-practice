# Optional

-----------------------------------------------

**Optional to deal with null.**

1. Optional class is introduced in Java 8.
2. Optional will help us in handling null pointer effectively.


```
Consider database is retrieving null collection, here the issue is with the data itself,
because it is empty in the table and constructed object is NULL.

With the help of Optional we can handle the NULL to not to throw exception and break the flow,
rather it helps us to check if data is present or is empty. 
```

### Optional.empty();

Using Optional.empty(); we can create empty optional object.

```java
Optional<Product> product1 = Optional.of(products);

Optional<Product> product2 = Optional.ofNullable(products); // If product is NULL, the resulting Optional object will be empty.
```

### Advantages of Optional:

1. NULL checks are not required.
2. No more NullPointerException at Runtime.
3. We can develop clean and neat APIs.
4. No more boilerplate code.

### Methods in Optional class in Java 8:

| method        | Description                                                                                                            |
|---------------|------------------------------------------------------------------------------------------------------------------------|
| empty()       | Returns an empty optional object.                                                                                      |
| filter()      | If value is Present and matches the given predicate, it returns this optional, otherwise return empty optional object. |
| isPresent()   | Returns true if a value is present; otherwise false.                                                                   |
| ifPresent()   | If a value is present, It invokes specified consumer with the value; otherwise nothing.                                |
| get()         | Return the value wrapped by this optional ifPresent; Otherwise throw NoSuchElementException.                           |
| map()         | If value is present, applies the provided mapping function on it.                                                      |
| orElse()      | Return true if present; otherwise returns the given default value.                                                     |
| orElseGet()   | Return the value if present, otherwise returns the given default value.                                                |
| orElseThrow() | Return the value if present, otherwise throw exception created by the given supplier.                                  |

