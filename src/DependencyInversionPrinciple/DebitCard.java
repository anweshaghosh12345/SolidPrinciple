package DependencyInversionPrinciple;

public class DebitCard implements Bank{
    public void doPayment(long amtn){
        System.out.println("pay using debit card");
    }
}
