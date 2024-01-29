package ConcreteDP.CreationalDP.FactoryMethod.SimpleFactoryMethod;

public class Sparrow implements Bird{

    private Sound sound;

    @Override
    public Sound createSound() {
        return new SparrowSound();
    }
}
