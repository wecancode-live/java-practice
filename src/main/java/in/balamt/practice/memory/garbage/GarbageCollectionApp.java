package in.balamt.practice.memory.garbage;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GarbageCollectionApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        //This will suggest the JVM to perform Garbage Collection.
        // Does not guarantee that it will perform the garbage collection.
        System.gc();

        /**
         * Loop continues until OutOfMemory Error is thrown by the JVM.
         * Heap memory will become full.
         */
        while(true) {
            map.put(String.valueOf(new Random().nextInt()), "newMap");
        }

    }
}
