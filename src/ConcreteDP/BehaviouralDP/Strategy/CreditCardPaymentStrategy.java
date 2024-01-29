package ConcreteDP.BehaviouralDP.Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(int amount) {

        // Logic to pay using Credicard ConcreteDP.BehaviouralDP.Strategy

        System.out.println("Paid : " + amount + " using Creditcard ConcreteDP.BehaviouralDP.Strategy");

        return false;
    }
}
