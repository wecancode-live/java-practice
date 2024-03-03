package in.balamt.practice.designpattern.behavioral.iterator;

public interface MenuIterator {
    boolean hasNext();
    MenuItem getNext();
    void reset();

}
