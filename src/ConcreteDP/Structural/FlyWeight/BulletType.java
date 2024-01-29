package ConcreteDP.Structural.FlyWeight;

public class BulletType implements  Bullet{

    private String name;
    private int radius;
    private String Colour;
    private int weight;
    private String image;
    private int maxDamage;
    private int maxrange;

    @Override
    public void flying(int x, int y) {
        // Logic for flying Bullet
    }
}
