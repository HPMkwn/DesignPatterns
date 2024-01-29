package ConcreteDP.CreationalDP.Factory.ClassRegistrationusingReflections;

public class ConcreteProduct implements Product {

    static {
        ProductFactory.getInstance().registerProduct("ID1",ConcreteProduct.class);
    }
}
