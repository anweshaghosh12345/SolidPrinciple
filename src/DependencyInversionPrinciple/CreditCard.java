package DependencyInversionPrinciple;

public class CreditCard implements Bank {

    @Override
    public void doPayment(long amtn) {
        System.out.println("pay using credit card" );
    }
}
