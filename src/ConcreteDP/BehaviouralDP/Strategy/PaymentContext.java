package ConcreteDP.BehaviouralDP.Strategy;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount){
        this.paymentStrategy.pay(amount);
    }

}
