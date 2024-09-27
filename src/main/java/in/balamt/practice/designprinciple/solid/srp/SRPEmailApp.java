package in.balamt.practice.designprinciple.solid.srp;

public class SRPEmailApp {
    public static void main(String...args){
     Email email = new Email();
     email.setTo("bob@email.com");
     email.setFrom("noreply@email.com");
     email.setSubject("Test email for Single Responsibility Principle");
     email.setBody("Single Responsibility Principle example using Email actions.");


     //By creating each actions as separate class to achieve the single responsibility operation/action.
     EmailSender emailSender = new EmailSender(email);
     EmailPrinter emailPrinter = new EmailPrinter(email);
     EmailSaver emailSaver = new EmailSaver(email);

     emailSender.send();
     emailPrinter.print();
     emailSaver.save();
    }
}
