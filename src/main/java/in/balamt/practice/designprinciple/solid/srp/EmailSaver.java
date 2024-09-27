package in.balamt.practice.designprinciple.solid.srp;

public class EmailSaver {
    private final Email email;
    public EmailSaver(Email email){
        this.email = email;
    }
    public void save(){
        System.out.println("Saving email");
        System.out.println(this.email.toString());
    }
}
