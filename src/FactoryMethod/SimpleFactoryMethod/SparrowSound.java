package FactoryMethod.SimpleFactoryMethod;

public class SparrowSound implements Sound{
    @Override
    public void makeSound() {
        System.out.println("Sparrow is making sound");
    }
}
