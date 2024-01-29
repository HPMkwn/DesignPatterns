package ConcreteDP.BehaviouralDP.Template;

public abstract class PhoneOrderTemplate {

    public final void createOrder(){
        selectPhone();
        packOrder();
        makePayment();
        deliverProduct();
    }

    public abstract void selectPhone();

    public void packOrder() {
        System.out.println("Packing the order");
    }
    public abstract void makePayment();

    public abstract void deliverProduct();

}
