package in.balamt.practice.datastructures.doubly;

public class DoublyLinkedListApp {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(); // Create a new linked list
        list.insertAtBeginning(3); // Insert 3 at the beginning
        list.insertAtBeginning(5); // Insert 5 at the beginning
        list.insertAtBeginning(7); // Insert 7 at the beginning
        list.printList(); // Print the linked list: 7 5 3
    }
}

class Node {
    int data;
    Node prev;
    Node next;

    // Constructor to create a new node with given data
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

