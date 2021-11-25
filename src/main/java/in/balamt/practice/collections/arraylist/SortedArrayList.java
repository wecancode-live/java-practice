package in.balamt.practice.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortedArrayList<T> extends ArrayList<T> {

    public void insertSorted(T value) {
        add(value);
    Comparable<T> comparable = (Comparable<T>) value;
        for (int i = size()-1; i > 0 && comparable.compareTo(get(i-1)) < 0; i--)
            Collections.swap(this, i, i-1);
    }
}
