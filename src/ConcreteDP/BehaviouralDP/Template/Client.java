package ConcreteDP.BehaviouralDP.Template;

public class Client {

    public static void main(String[] args) {
        PhoneOrderTemplate buyoffline = new BuyOffline();
        buyoffline.createOrder();

        PhoneOrderTemplate buyonline = new BuyOnline();
        buyonline.createOrder();
    }
}
