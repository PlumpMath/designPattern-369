package structural.decorator;

/**
 * Created by manish.sharan on 06/09/16
 */
public class SauceDecorator extends PizzaDecorator {

    public SauceDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription(){
        return super.getDescription().concat(" ,Add Sauce");
    }

    public int getCost(){
        return super.getCost() + 30;
    }
}
