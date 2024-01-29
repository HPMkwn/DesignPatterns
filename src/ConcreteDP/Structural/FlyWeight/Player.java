package ConcreteDP.Structural.FlyWeight;

public class Player {

    private BulletFactory bulletFactory;

    public Player(BulletFactory bulletFactory) {
        this.bulletFactory = bulletFactory;
    }

    public void fireBullet(String bulletType, int x, int y){
        Bullet bullet = new FluweightBullet(bulletFactory.getBullet(bulletType));

        bullet.flying(x,y);
    }
}
