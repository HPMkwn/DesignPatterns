package FactoryMethod.SimpleFactoryMethod;

public class Peacock implements Bird{

    private Sound sound;
    @Override
    public Sound createSound() {
        return new PigeonSound();
    }
}
