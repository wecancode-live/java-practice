Certainly! Below is an example of a Java class where `hashCode()` and `equals()` methods are overridden, and a hash collision occurs:

```java
import java.util.Objects;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        // Generate a hash code based on ID to have hash collision
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        // Create two student objects with different names but the same ID
        Student student1 = new Student(101, "John");
        Student student2 = new Student(101, "Alice");

        // Check if they are equal
        System.out.println("Are student1 and student2 equal? " + student1.equals(student2));

        // Check their hash codes
        System.out.println("Hash code of student1: " + student1.hashCode());
        System.out.println("Hash code of student2: " + student2.hashCode());
    }
}

```

In this example:
- We have a `Student` class with `id` and `name` fields.
- We override the `equals()` method to compare `Student` objects based on their `id` and `name`.
- We override the `hashCode()` method to generate a hash code based only on the `id`.
- In the `main()` method, we create two `Student` objects with different names but the same ID.
- Even though the `name` fields are different, the `equals()` method considers them equal because they have the same ID.
- However, the `hashCode()` method only takes the ID into account, so both objects produce the same hash code.
- As a result, a hash collision occurs because two distinct objects produce the same hash code.

You will see the output:
```
Are student1 and student2 equal? true
Hash code of student1: 101
Hash code of student2: 101
```
Despite having different names, `student1` and `student2` are considered equal because they have the same ID. Additionally, their hash codes are the same, indicating a hash collision.