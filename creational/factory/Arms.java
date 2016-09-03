package creational.factory;

import creational.abstractFactory.Weapons;

/**
 * Created by manish.sharan on 03/09/16
 */
public class Arms implements Weapons {

    public String getArmType(){
        return "arms";
    }

    @Override
    public String getName() {
        return getArmType();
    }
}
