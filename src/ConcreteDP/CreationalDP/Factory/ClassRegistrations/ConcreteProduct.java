package ConcreteDP.CreationalDP.Factory.ClassRegistrations;

public class ConcreteProduct extends Product {

    static {
        ProductFactory.getInstance().registerProduct(Constants.ID1,new ConcreteProduct());
    }

    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
