package behavioral.strategy;

public class CreditCard implements PaymentMode {
    @Override
    public void pay(Long money) {
        System.out.println("Paying " + money + " via credit card");
    }
}
