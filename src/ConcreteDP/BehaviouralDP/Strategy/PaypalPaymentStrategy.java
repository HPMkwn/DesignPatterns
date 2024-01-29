package ConcreteDP.BehaviouralDP.Strategy;

public class PaypalPaymentStrategy implements PaymentStrategy {

    private String email;

    public PaypalPaymentStrategy(String email) {
        this.email = email;
    }

    @Override
    public boolean pay(int amount) {
        // Logic for Payment for Paypal ConcreteDP.BehaviouralDP.Strategy
        System.out.println("Paid : " + amount + " via Paypal strategy");

        return false;
    }
}
