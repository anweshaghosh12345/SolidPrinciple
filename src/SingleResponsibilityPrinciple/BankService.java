package SingleResponsibilityPrinciple;
//does not follow single responsibility principle
public class BankService {
    public void printPassbook(){

    }
    public void getLoanInterestInfo(String loanType){

    }
    public void sendOTP(String medium){
        if(medium.equals("email")){
            System.out.println("email sent");
        }
        if(medium.equals("message")){
            System.out.println("message sent");
        }
    }
}
