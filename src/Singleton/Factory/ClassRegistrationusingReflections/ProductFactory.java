package Singleton.Factory.ClassRegistrationusingReflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ProductFactory {



    private static ProductFactory productFactory = new ProductFactory();
    private HashMap m_RegisteredProducts = new HashMap();

    /**
     * Drawbacks
     * <br>
     * 1:) The main one is performance. When the reflection is used the performance on code involving reflection can decrease even to 10% of the poerfomance of a non reflection code.
     * <br>2:) Another issue is that not all the programming languages provide reflection mechanism.
     *
     * */
    private ProductFactory(){}

    public static ProductFactory getInstance(){
        return productFactory;
    }


    public void registerProduct (String productID, Class productClass)
    {
        m_RegisteredProducts.put(productID, productClass);
    }

    public Product createProduct(String productID) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class productClass = (Class)m_RegisteredProducts.get(productID);
        Constructor productConstructor = productClass.getDeclaredConstructor(new Class[] { String.class });
        return (Product)productConstructor.newInstance(new Object[] { });
    }



}
