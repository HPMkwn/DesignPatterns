package FactoryMethod;

public enum WeaponType {

    SHORT_SWORD("short sword"),
    SPEAR("spear"),
    AXE("axe"),
    UNDEFINED("");

    private final String title;

    WeaponType(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "WeaponType{" +
                "title='" + title + '\'' +
                '}';
    }
}
