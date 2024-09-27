A singly linked list is a data structure consisting of a sequence of elements called nodes. Each node contains two parts: data and a reference (or pointer) to the next node in the sequence. The last node in the list points to null, indicating the end of the list. Here's an example of implementing a singly linked list in Java:

```java
class Node {
    int data;
    Node next;

    // Constructor to create a new node with a given data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private Node head; // Head node of the linked list

    // Constructor to initialize an empty linked list
    public SinglyLinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head; // Set the next of the new node to the current head
        head = newNode; // Set the head to the new node
    }

    // Method to print all elements of the linked list
    public void printList() {
        Node current = head; // Start from the head node
        System.out.print("Linked list: ");
        while (current != null) {
            System.out.print(current.data + " "); // Print data of the current node
            current = current.next; // Move to the next node
        }
        System.out.println();
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(); // Create a new linked list
        list.insertAtBeginning(3); // Insert 3 at the beginning
        list.insertAtBeginning(5); // Insert 5 at the beginning
        list.insertAtBeginning(7); // Insert 7 at the beginning
        list.printList(); // Print the linked list: 7 5 3
    }
}
```

In this example, we define a `Node` class representing a node of the linked list. Then, we define a `SinglyLinkedList` class to manage the operations of the linked list. The `insertAtBeginning` method inserts a new node at the beginning of the list, and the `printList` method prints all elements of the list. Finally, in the `main` method, we create a linked list object, insert some elements, and print the list.