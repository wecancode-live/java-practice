package in.balamt.practice.solid.srp;

public class EmailPrinter {
    private final Email email;
    public EmailPrinter(Email email){
        this.email = email;
    }
    public void print(){
        System.out.println("Printing email");
        System.out.println(this.email.toString());
    }
}
