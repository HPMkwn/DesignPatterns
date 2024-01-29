package ConcreteDP.CreationalDP.FactoryMethod;

public class ARCWeapon implements Weapon {

    private final WeaponType weaponType;

    protected ARCWeapon(WeaponType weaponType){
        this.weaponType = weaponType;
    }
    @Override
    public String toString() {
        return "ARCWeapon{" +
                "weaponType=" + weaponType +
                '}';
    }

    @Override
    public Weapon createWeapon(WeaponType weaponType) {
        return new ARCWeapon(weaponType);
    }
}
