package FactoryMethod.SimpleFactoryMethod;

public class PigeonSound implements Sound{

    @Override
    public void makeSound() {
        System.out.println("Pigeon is making sound");
    }
}
