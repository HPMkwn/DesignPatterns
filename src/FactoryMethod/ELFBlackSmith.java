package FactoryMethod;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class ELFBlackSmith implements BlackSmith{

    private static final Map<WeaponType,ELFWeapon> weapons;

    static {
        weapons = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(weaponType -> weapons.put(weaponType,new ELFWeapon(weaponType)));
    }


    @Override
    public Weapon makeWeapon(WeaponType weaponType) {
        return (Weapon) weapons.get(weaponType).createWeapon(weaponType);
    }
}
