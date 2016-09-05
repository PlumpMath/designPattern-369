package structural.decorator;

/**
 * Created by manish.sharan on 06/09/16.
 */
public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription(){
        return super.getDescription().concat(" , Add Cheese");
    }

    public int getCost(){
        return super.getCost() + 50;
    }
}
