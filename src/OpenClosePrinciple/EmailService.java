package OpenClosePrinciple;

public class EmailService implements OtpService{

    @Override
    public void sentOtp(String medium) {
        System.out.println("Email Sent");
    }
}
