package creational.abstractFactory;


/**
 * Created by manish.sharan on 03/09/16.
 */
public class AmmunitionsFactory extends WeaponFactory {

    public Ammunition getArms(String armType){
        switch(armType){
            case "bullets":
                return new Bullets();
            case "shell":
                return new Shell();
            default:
                return null;
        }
    }

    @Override
    public Weapons getWeapons(String weapon) {
        return getArms(weapon);
    }
}
