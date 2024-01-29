package ConcreteDP.CreationalDP.FactoryMethod.SimpleFactoryMethod;

public class Pigeon implements Bird{

    private Sound sound;
    @Override
    public Sound createSound() {
        return new PigeonSound();
    }
}
