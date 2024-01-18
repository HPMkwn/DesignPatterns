package FactoryMethod.SimpleFactoryMethod;

public class PeacockSound implements Sound{
    @Override
    public void makeSound() {
        System.out.println("Peacock is making soound");
    }
}
