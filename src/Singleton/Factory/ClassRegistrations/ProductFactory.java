package Singleton.Factory.ClassRegistrations;

import java.util.HashMap;

public class ProductFactory {



    private static final ProductFactory productFactory = new ProductFactory();
    private final HashMap<String,Product> m_RegisteredProducts = new HashMap<>();

    private ProductFactory(){}

    public static ProductFactory getInstance(){return productFactory;}

    public void registerProduct(String productId, Product p){
        m_RegisteredProducts.put(productId,p);
    }

    public Product createProduct(String productId){
        return ((Product)m_RegisteredProducts.get(productId).createProduct());
    }


}
