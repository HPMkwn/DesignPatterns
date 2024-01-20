package Adapter;

public interface BankThirdPartyAPI {

    public int getBalance();

    public void addBalance(int toAccount, int amount);

    public boolean Pay(int toAccount, int amount);

}
