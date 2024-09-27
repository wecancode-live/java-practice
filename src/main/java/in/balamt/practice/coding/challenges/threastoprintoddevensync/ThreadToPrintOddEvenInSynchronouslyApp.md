Yes, you can achieve this by using two threads, where one thread prints odd numbers and the other thread prints even numbers alternately, ensuring that they print in order. Here's an example of how you can implement this in Java using two threads and synchronization:

```java
public class PrintOddEvenInOrder {
    private static final Object lock = new Object();
    private static volatile int count = 1;
    private static final int MAX_COUNT = 10;

    public static void main(String[] args) {
        Thread oddThread = new Thread(() -> printOdd());
        Thread evenThread = new Thread(() -> printEven());

        oddThread.start();
        evenThread.start();
    }

    private static void printOdd() {
        while (count <= MAX_COUNT) {
            synchronized (lock) {
                while (count % 2 == 0) { // Wait until it's an odd number's turn
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count <= MAX_COUNT) {
                    System.out.println("Odd: " + count);
                    count++;
                    lock.notify(); // Notify the other thread to continue
                }
            }
        }
    }

    private static void printEven() {
        while (count <= MAX_COUNT) {
            synchronized (lock) {
                while (count % 2 != 0) { // Wait until it's an even number's turn
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count <= MAX_COUNT) {
                    System.out.println("Even: " + count);
                    count++;
                    lock.notify(); // Notify the other thread to continue
                }
            }
        }
    }
}
```

In this example:

- We have two threads (`oddThread` and `evenThread`) that execute the `printOdd` and `printEven` methods, respectively.
- The `count` variable is used to keep track of the number to be printed next.
- Both threads use the `synchronized` block to ensure mutual exclusion and prevent race conditions.
- The `wait` and `notify` methods are used for communication between the two threads. The odd thread waits until it's an odd number's turn, and the even thread waits until it's an even number's turn. After printing the number, each thread notifies the other thread to continue.

This ensures that the numbers are printed in order, with odd numbers printed by one thread and even numbers printed by the other thread.