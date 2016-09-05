package structural.decorator;

/**
 * Created by manish.sharan on 06/09/16
 */
public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Dough";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
