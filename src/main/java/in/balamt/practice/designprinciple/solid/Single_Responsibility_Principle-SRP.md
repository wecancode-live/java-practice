SOLID - Single Responsibility Principle (SRP)
----------------------------------------------------

The Single Responsibility Principle (SRP) is a fundamental principle of object-oriented programming that states that a class should have only one reason to change, meaning it should have only one responsibility. The idea behind SRP is that a class should have a single purpose, which makes it easier to maintain and modify the code.

In Java, we can illustrate the SRP with the following example. Let's say we have a class called Email that represents an email message:

```java

public class Email {
    private String from;
    private String to;
    private String subject;
    private String body;

    public void send() {
        // send email
    }
    
    public void save() {
        // save email to disk
    }
    
    public void print() {
        // print email
    }
    
    // getters and setters
}
```
In this example, the Email class has multiple responsibilities: it sends email, saves email to disk, and prints email. This violates the SRP because if any of these responsibilities changes, the Email class needs to be modified, which makes it harder to maintain and modify the code.

To fix this violation of the SRP, we can separate the responsibilities into separate classes. For example, we can create a class called EmailSender that is responsible for sending email:

```java
public class EmailSender {
    public void send(Email email) {
    // send email
    }
}
```
And we can create a class called EmailSaver that is responsible for saving email to disk:

```java

public class EmailSaver {
    public void save(Email email) {
    // save email to disk
    }
}

```
And we can create a class called EmailPrinter that is responsible for printing email:

```java

public class EmailPrinter {
    public void print(Email email) {
    // print email
    }
}

```
Now, the Email class has only one responsibility: representing an email message. If any of the other responsibilities change, we only need to modify the corresponding class, which makes the code easier to maintain and modify.

```java
public class Email {
    private String from;
    private String to;
    private String subject;
    private String body;

    // getters and setters
}
```
This is an example of the Single Responsibility Principle in action. By separating responsibilities into separate classes, we have made the code easier to maintain and modify, and we have reduced the likelihood of bugs and errors.