package Singleton.Factory.ParameterizedFactory;

public class FactoryClass {


    /**
     * The problem here is that once we add a new concrete product call we should modify the
     * Factory class. It is not very flexible and it violates open close principle.
     * Of course we can subclass the factory class, but let's not forget that the factory class
     * is usually used as a singleton. Subclassing it means replacing all the factory class
     * references everywhere through the code.
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
