package in.balamt.practice.datastructures;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(); // Create a new linked list
        list.insertAtBeginning(3); // Insert 3 at the beginning
        list.insertAtBeginning(5); // Insert 5 at the beginning
        list.insertAtBeginning(7); // Insert 7 at the beginning
        list.printList(); // Print the linked list: 7 5 3
    }

}

class Node {
    int data;
    Node next;

    // Constructor to create a new node with a given data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


