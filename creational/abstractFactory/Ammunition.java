package creational.abstractFactory;

/**
 * Created by manish.sharan on 03/09/16
 */
public class Ammunition implements Weapons{

    public String getAmmunitionType(){
        return "Ammunition";
    }

    @Override
    public String getName() {
        return getAmmunitionType();
    }
}
