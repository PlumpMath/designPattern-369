package structural.decorator;

/**
 * Created by manish.sharan on 06/09/16.
 */
public abstract class PizzaDecorator implements Pizza{

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){
        return pizza.getDescription();
    }

    public int getCost(){
        return pizza.getCost();
    }
}
