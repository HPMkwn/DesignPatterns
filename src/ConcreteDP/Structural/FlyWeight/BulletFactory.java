package ConcreteDP.Structural.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {
    private Map<String, BulletType> bulletPool = new HashMap<>();

    public BulletType getBullet(String bulletType){
        if(!bulletPool.containsKey(bulletType)){
            bulletPool.put(bulletType, new BulletType());
        }

        return bulletPool.get(bulletType);
    }


}
