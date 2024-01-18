package FactoryMethod;

public final class ELFWeapon implements Weapon{

    private final WeaponType weaponType;

    ELFWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "ELFWeapon{" +
                "weaponType=" + weaponType +
                '}';
    }

    @Override
    public Weapon createWeapon(WeaponType weaponType){
        return new ELFWeapon(weaponType);
    }
}
