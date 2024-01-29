package ConcreteDP.CreationalDP.Singleton.LazySingleton;

public class Client {
    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance() == LazySingleton.getInstance());
    }
}
