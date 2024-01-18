package FactoryMethod;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class ArcBlackSmith implements BlackSmith{

    public static final Map<WeaponType,ARCWeapon> weapons;

    static {
        weapons = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(weaponType -> weapons.put(weaponType,new ARCWeapon(weaponType)));
    }


    @Override
    public Weapon makeWeapon(WeaponType weaponType) {
        return weapons.get(weaponType).createWeapon(weaponType);
    }
}
