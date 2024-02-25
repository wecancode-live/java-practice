# Garbage Collection (GC)

--------------------------------------

Objects on the heap takes up spaces. We may not need all the objects created inside the heap.

To clean up the heap memory, JVM uses the **Garbage collection**. which removes the unused/un-referenced objects in the
heap memory.

## How to start GC?

We cannot force JVM to perform Garbage collection, rather we can **Suggest** the JVM to perform GC.
Only the JVM has the full control on GC, and it decides when to actually perform the GC.

```text
Only objects without relation to the stack can be garbage collected.
```

## Memory Leak:
Memory gets allocated, but does not deallocate which cause the memory leak. 
meaning when the object is created, and it is not cleaned up by the GC 
or by us (nullify or deallocate the object reference)
causing the Memory leak by increasing the memory usage.

Garbage collection can free-up the memory, but cannot do anything about the Memory Leak.
Which gives us the responsibility of managing the memory leak when we write code.

1. _Memory leak are caused because of Poor coding standards and not following the design principles._
2. _Static variables cause memory leak very much, try to avoid static variables, because static variables live until
the application is exited (i.e, It persists in memory until the Lifetime of java application)_
3. _Custom objects not having_ **equals**, **hashCode** _methods implemented within could cause memory leak as well._

    ### Tools:

    Memory leak can be monitored using Monitoring tools (Profiler, VisualVM etc).
    These tools can be used to analyze the JVM memory usage.
