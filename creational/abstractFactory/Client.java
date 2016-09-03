package creational.abstractFactory;

/**
 * Created by manish.sharan on 03/09/16.
 */
public class Client {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new WeaponFactory() {
            @Override
            public Weapons getWeapons(String weapon) {
                return null;
            }
        };

        WeaponFactory weaponFactory1 = weaponFactory.getWeaponFactory("arm");
        Weapons weapon = weaponFactory1.getWeapons("tank");
        System.out.println(weapon.getName());

        weaponFactory1 = weaponFactory.getWeaponFactory("ammunition");
        weapon = weaponFactory1.getWeapons("shell");
        System.out.println(weapon.getName());
    }
}
