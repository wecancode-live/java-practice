package in.balamt.practice.coding.challenges.hashcodeequals;

import java.io.Serializable;
import java.util.Objects;

public class HashCodeEqualsCollisionApp implements Serializable {
    private int id;
    private String name;

    public HashCodeEqualsCollisionApp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCodeEqualsCollisionApp student = (HashCodeEqualsCollisionApp) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        // Generate a hash code based only on the ID
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        // Create two student objects with different names but the same ID
        HashCodeEqualsCollisionApp student1 = new HashCodeEqualsCollisionApp(101, "John");
        HashCodeEqualsCollisionApp student2 = new HashCodeEqualsCollisionApp(101, "Alice");

        // Check if they are equal
        System.out.println("Are student1 and student2 equal? " + student1.equals(student2));

        // Check their hash codes
        System.out.println("Hash code of student1: " + student1.hashCode());
        System.out.println("Hash code of student2: " + student2.hashCode());
    }
}
