package ConcreteDP.Structural.FlyWeight;

public class FluweightBullet extends BulletType implements Bullet{


    private int direction;
    private int speed;
    private String targetCoordinates;
    private BulletType bulletType;

    public FluweightBullet(BulletType bulletType) {
        this.bulletType = bulletType;
    }

    @Override
    public void flying(int x, int y) {
        // Flying Logic
    }
}
