package in.balamt.practice.designprinciple.solid.srp;

public class EmailSender {
    private final Email email;
    public EmailSender(Email email){
        this.email = email;
    }
    public void send(){
        System.out.println("Sending email");
        System.out.println(this.email.toString());
    }
}
