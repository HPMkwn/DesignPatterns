package ConcreteDP.CreationalDP.Singleton.EagerSingleton;

public class Client {
    public static void main(String[] args) {
        System.out.println(EagerSingleton.getInstance() == EagerSingleton.getInstance());
    }
}
