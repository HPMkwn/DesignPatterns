package ConcreteDP.BehaviouralDP.Template;

public class BuyOffline extends PhoneOrderTemplate{
    @Override
    public void selectPhone() {
        System.out.println("Selecting phone using help of shopkeeper");
    }

    @Override
    public void makePayment() {
        System.out.println("Making a payment to shopkeeper by cash");
    }

    @Override
    public void deliverProduct() {
        System.out.println("Handing over an phone to customer");
    }
}
