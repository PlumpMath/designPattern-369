package creational.abstractFactory;

import creational.factory.ArmyFactory;

/**
 * Created by manish.sharan on 03/09/16.
 */
public abstract class WeaponFactory {

    public WeaponFactory getWeaponFactory(String factoryType){
        switch (factoryType){
            case "arm": return new ArmyFactory();
            case "ammunition": return new AmmunitionsFactory();
            default:return null;
        }
    }

    public abstract Weapons getWeapons(String weapon);
}
