package in.balamt.practice.solid.srp;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Email {
    private String to;
    private String from;
    private String subject;
    private String body;


    /**
     * Below actions need to be in separate class, that way we are not having multiple
     * operations/actions in one single class.
     *
     * This way we are sticking with the Single Responsibility Principle in SOLID principles.
     */
//
//    public void send(){
//        System.out.println("Sending Email");
//        System.out.println(to + " " + from + " " + subject + " " +  body);
//    }
//
//    public void save(){
//        System.out.println("Sending Email");
//        System.out.println(to + " " + from + " " + subject + " " +  body);
//    }
//
//    public void print(){
//        System.out.println("Sending Email");
//        System.out.println(to + " " + from + " " + subject + " " +  body);
//    }
}
