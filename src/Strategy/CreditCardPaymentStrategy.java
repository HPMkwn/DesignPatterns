package Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(int amount) {

        // Logic to pay using Credicard Strategy

        System.out.println("Paid : " + amount + " using Creditcard Strategy");

        return false;
    }
}
