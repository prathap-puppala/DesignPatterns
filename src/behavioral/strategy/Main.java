package behavioral.strategy;

// Strategy pattern is used when different algorithms exists for same task,
// and we want to decide algorithm at Runtime
public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentMode(new CreditCard());
        paymentService.pay(100l);

        paymentService.setPaymentMode(new DebitCard());
        paymentService.pay(100l);

        paymentService.setPaymentMode(new UPI());
        paymentService.pay(100l);
    }
}
