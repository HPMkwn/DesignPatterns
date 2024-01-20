package Adapter;

public class Client {
    public static void main(String[] args) {
        BankThirdPartyAPI bankThirdPartyAPI = new PhonePayAdapter();
    }
}
