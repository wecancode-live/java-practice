package in.balamt.practice.collections.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.push("hello");
        ll.add("world");
        ll.add("w0r1d");
        ll.add("h3110");
        System.out.println("Linked List Iterator : Reverse ");
        Iterator<String> ill = ll.descendingIterator();
        while(ill.hasNext()){
            System.out.println(ill.next());
        }

        System.out.println("Linked List Iterator : Forward ");
        ill = ll.iterator();

        while(ill.hasNext()){
            System.out.println(ill.next());
        }

        System.out.println("Linked List Stream : Reverse ");
        ll.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        System.out.println("Linked List Stream : Forward ");
        ll.stream().sorted()
                .flatMap(x -> Arrays.stream(x.split("")))
                .filter(h -> h.matches("\\d"))
                .forEach(System.out::println);
    }
}
