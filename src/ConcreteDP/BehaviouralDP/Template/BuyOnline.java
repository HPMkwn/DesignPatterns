package ConcreteDP.BehaviouralDP.Template;

public class BuyOnline extends PhoneOrderTemplate{
    @Override
    public void selectPhone() {
        System.out.println("selecting Phone from Flipcart.com");
    }

    @Override
    public void makePayment() {
        System.out.println("Making a payment from flipcart on ios");
    }

    @Override
    public void deliverProduct() {
        System.out.println("Flipcart is delivering the product");
    }
}
