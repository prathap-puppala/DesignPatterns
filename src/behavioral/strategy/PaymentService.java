package behavioral.strategy;

public class PaymentService {
    private PaymentMode paymentMode;
    private Long money;

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public void pay(Long money) {
        this.paymentMode.pay(money);
    }
}
