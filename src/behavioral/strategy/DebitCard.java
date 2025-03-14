package behavioral.strategy;

public class DebitCard implements PaymentMode {
    @Override
    public void pay(Long money) {
        System.out.println("Paying " + money + " via debit card");
    }
}
