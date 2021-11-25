package in.balamt.practice.collections.arraylist;

import java.util.*;

public class ArrayListApp {
    public static void main(String[] args) {

        List<String> sampleArray = new ArrayList<>();

        sampleArray.add("Hello");
        sampleArray.add("Apple");
        sampleArray.add("Hello");
        sampleArray.add("Cat");


        //Sort Array List
        List<String> collSortArray = sampleArray;
        Collections.sort(collSortArray);
        collSortArray.forEach(System.out::println);
        collSortArray = null;

        // Sort using lambda and sorted method
        List<String> lambdaSortArray = sampleArray;
        lambdaSortArray.stream().sorted().forEach(System.out::println);
        lambdaSortArray = null;

        //Sort using Set
        SortedArrayList<String> setSortArray = new SortedArrayList<String>();
        setSortArray.insertSorted("Bat");
        setSortArray.insertSorted("Cat");
        setSortArray.insertSorted("Rat");
        setSortArray.insertSorted("At");

        setSortArray.stream().forEach(System.out::println);

    }
}
