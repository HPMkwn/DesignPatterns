package ConcreteDP.Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        BankThirdPartyAPI bankThirdPartyAPI = new PhonePayAdapter();
    }
}
