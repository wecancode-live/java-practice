# Stream API
 
Starting from Java 8, we have Java Streams.

It is part of java.util.streams package.
Note: It is not part of java.io.streams (which is part of input/output streams)

Streams is used to process object of collection.

Ex: 1000 employee details we can collect in Collection (List)
Whereas streams can be applied on to the collection to process them.

Collection is something physically hold the elements, whereas stream is just a container which holds
the collection stream.

Stream makes copy of the collection, So it does not modify the original collection.

some methods : filter, map, flatMap, sorted, distinct etc.

## Ways to create Stream
```
List<String> departments = new ArrayList<>();
departments.add("IT");
departments.add("HR");
departments.add("SALES");

Stream<String> depStream = departments.stream();
depStream.forEach(System.out:println); // Pring each item from the ArrayList.


Stream<String> colors = Stream.of("Black", "Blue", "Red");
colors.forEach(System.out:println); // Pring each item from the ArrayList.

```

## Parallel Stream

Parallel Stream is used to process the items in collection parallel.
JVM takes care of executing the parallel stream, by allocating the threads on its own.
It makes processes in lesser time, this parallel stream is used in place where we need to perform non-synchronous 
operation/action need to be performed.

```
Stream<String> parallelStream = depStream.parallelStream();
parallelStream.forEach(System.out:println);
```

----------------------------------------------------

# Pipeline operations in Streams

We use pipeline of operations on the streams at different stages.

* Creating a stream - using stream() method, parallelStream() or Streams.of()
* One or more intermediate operations (filter, map, flatMap... etc) for transforming the initial stream into 
  others or filtering.
* Applying a terminal operation to produce result.


## Array to Stream

Inside java.util.Arrays, new static methods were added to convert an array into a stream.

1. Arrays.stream(array) - to create stream from an array
2. Arrays.stream(array, from, to) - to create stream from part of array with starting index and ending index.


