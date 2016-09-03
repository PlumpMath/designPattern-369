package creational.factory;

/**
 * Created by manish.sharan on 30/08/16
 */
public class Client {

    public static void main(String[] args) {
        Arms arms = new ArmyFactory().getArms("gun");
        System.out.println(arms.getArmType());

        arms = new ArmyFactory().getArms("tank");
        System.out.println(arms.getArmType());
    }

}
