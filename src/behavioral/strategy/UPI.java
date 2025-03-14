package behavioral.strategy;

public class UPI implements PaymentMode {
    @Override
    public void pay(Long money) {
        System.out.println("Paying " + money + " via UPI");
    }
}
