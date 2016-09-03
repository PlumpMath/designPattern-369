package creational.factory;

import creational.abstractFactory.WeaponFactory;
import creational.abstractFactory.Weapons;

/**
 * Created by manish.sharan on 03/09/16
 */
public class ArmyFactory extends WeaponFactory{

    public Arms getArms(String armType){
        switch(armType){
            case "gun":
                return new Guns();
            case "tank":
                return new Tank();
            default:
                return null;
        }
    }

    @Override
    public Weapons getWeapons(String weapon) {
        return getArms(weapon);
    }
}
