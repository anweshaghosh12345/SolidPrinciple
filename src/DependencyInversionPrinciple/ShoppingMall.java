package DependencyInversionPrinciple;

public class ShoppingMall {
    private Bank bank;

    public ShoppingMall(Bank bank){
        this.bank=bank;
    }

    public void doPurchase(long amtn){
        bank.doPayment(amtn);
    }
    public static void main(String[]args){
        DebitCard debitCard=new DebitCard();
        CreditCard creditCard=new CreditCard();
        Bank bank1=new CreditCard();
        ShoppingMall shoppingMall=new ShoppingMall(creditCard);
        shoppingMall.doPurchase(5000);
    }
}
