package ConcreteDP.CreationalDP.Factory.ClassRegistrationusingReflections;

public class Client {

    /**
     * We have to make sure that the concrete product classes are loaded before they are required by the factory for registration(if they are not loaded they will not be registered in the factory and createProduct will return null). To ensure it we are going to use the Class.forName method right in the static section of the main class. This section is executed right after the main class is loaded. Class.forName is supposed to return a Class instance of the indicated class. If the class is not loaded by the compiler yet, it will be loaded when the Class.forName is invoked.
     *
     *
     * */
    static
    {
        try
        {
            Class.forName("OneProduct");
            Class.forName("AnotherProduct");
        }
        catch (ClassNotFoundException any)
        {
            any.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ProductFactory.getInstance().registerProduct(Constants.ID1, ConcreteProduct.class);
    }
}
