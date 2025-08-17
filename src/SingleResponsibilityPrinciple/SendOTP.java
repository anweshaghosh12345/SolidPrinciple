package SingleResponsibilityPrinciple;

public class SendOTP {
    public void sendOTP(String medium){
        if(medium.equals("email")){
            System.out.println("email sent");
        }
        if(medium.equals("message")){
            System.out.println("message sent");
        }
    }
}
