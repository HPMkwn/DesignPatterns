package ConcreteDP.Structural.Adapter;

public class PhonePayAdapter implements BankThirdPartyAPI {

    PhonePay phonePay = new PhonePay();


    @Override
    public int getBalance() {
        return phonePay.checkBalance();
    }

    @Override
    public void addBalance(int account, int amount) {
        phonePay.addAmountToAcount(account,amount);
    }

    @Override
    public boolean Pay(int toAccount, int amount) {
        return phonePay.payToAccount(toAccount,amount);
    }
}
