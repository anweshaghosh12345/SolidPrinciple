package OpenClosePrinciple;

public class MobileService implements OtpService {
    @Override
    public void sentOtp(String medium) {
        System.out.println("Mobile OTP");
    }
}
