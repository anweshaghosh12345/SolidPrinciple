package OpenClosePrinciple;
//this does ot follow open close principle
public class NotificationService {
    public void sendOTP(String medium){
        if(medium.equals("email")){
            System.out.println("email sent");
        }
        if(medium.equals("message")){
            System.out.println("message sent");
        }
    }
}
