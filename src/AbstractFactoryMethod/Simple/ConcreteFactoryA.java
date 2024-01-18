package AbstractFactoryMethod.Simple;

public class ConcreteFactoryA implements AbstractFactory{
    @Override
    public Product1 createProduct1() {
        return new ConcreteProduct1A();
    }

    @Override
    public Product2 createProduct2() {
        return new ConcreteProduct2A();
    }
}
