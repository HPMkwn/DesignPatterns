package Strategy;

public class Client {


    public static void main(String[] args) {
        PaymentStrategy creditcardPaymentStrategy = new CreditCardPaymentStrategy("123456789000");
        PaymentStrategy paypalPaymentStrategy = new PaypalPaymentStrategy("abc@def.com");


        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(creditcardPaymentStrategy);
        paymentContext.processPayment(100);

        paymentContext.setPaymentStrategy(paypalPaymentStrategy);
        paymentContext.processPayment(200);

    }
}
