package behavioral.strategy;

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
