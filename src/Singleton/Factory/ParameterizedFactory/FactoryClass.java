package Singleton.Factory.ParameterizedFactory;

public class FactoryClass {


    /**
     * <p>The implementation is really simple
     * The client needs a product, but instead of creating it directly using the new operator, it asks the factory object for a new product, providing the information about the type of object it needs.
     * The factory instantiates a new concrete product and then returns to the client the newly created product(casted to abstract product class).
     * The client uses the products as abstract products without being aware about their concrete implementation.
     *</p>
     *
     * <p>
     * The problem here is that once we add a new concrete product call we should modify the
     * Factory class. It is not very flexible and it violates open close principle.
     * Of course we can subclass the factory class, but let's not forget that the factory class
     * is usually used as a singleton. Subclassing it means replacing all the factory class
     * references everywhere through the code.
     * </p>
     * */
    public Product createProduct(String productID){
        if(productID.equals(Constants.ID1)){
            return new ConcreteProduct();
        }else if(productID.endsWith(Constants.ID2)){
            return new AnotherConcreteProduct();
        }

        return null;
    }

    // Disadvantage



}
