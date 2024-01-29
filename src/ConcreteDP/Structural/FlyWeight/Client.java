package ConcreteDP.Structural.FlyWeight;

public class Client {

    public static void main(String[] args) {
        BulletFactory bulletFactory = new BulletFactory();

        // Create players with different bullet types
        Player player1 = new Player(bulletFactory);
        Player player2 = new Player(bulletFactory);

        // Players fire bullets at different locations
        player1.fireBullet("9mm", 10, 20);
        player2.fireBullet(".45 ACP", 30, 40);
        player1.fireBullet("9mm", 15, 25);
        player2.fireBullet(".45 ACP", 35, 45);
    }
}
