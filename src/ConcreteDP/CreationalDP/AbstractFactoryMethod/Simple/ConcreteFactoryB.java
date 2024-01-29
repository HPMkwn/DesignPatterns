package ConcreteDP.CreationalDP.AbstractFactoryMethod.Simple;

public class ConcreteFactoryB implements AbstractFactory{
    @Override
    public Product1 createProduct1() {
        return new ConcreteProduct1B();
    }

    @Override
    public Product2 createProduct2() {
        return new ConcreteProduct2B();
    }
}
