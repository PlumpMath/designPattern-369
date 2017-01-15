package structural.decorator;

/**
 * Created by manish.sharan on 05/09/16
 */
public class Client {

    public static void main(String[] args) {
        Pizza pizza = new SauceDecorator(new CheeseDecorator(new PlainPizza()));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        pizza = new CheeseDecorator(new PlainPizza());
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        pizza = new CheeseDecorator(new CheeseDecorator(new PlainPizza()));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }

    /*
    Philosophy:

         Decorator pattern is used when we want to add features to a already created object at runtime. We take the object created and wrap some decorated object on
         top of that object which provide additional functionalities to the existing object.

         We create a decorator class which should belong to the type of the object we want to decorate. Hence the pizza decorator class implements Pizza interface.
         Plain Pizza is giving us the basic object. Now we want to build addition functionality on top of it, like adding sauce, adding cheese.

         The extra functionality classes would inherit the decorator class which would take the type of basic object as input (pizza type here).
         So its like a chaining we create of the functionalities which extend till the basic object.
         Sauce wraps around cheese which wraps around plain pizza.

         The functions provided by the basic object (plain pizza) are used in the decorator class as well so that the functionality of the similar method can be
         enhanced by the decorator classes. The decorator classes override the functionalities to add additional data in the functionality and chain till the
         basic object functionality.

         Additional benefit of decorator pattern is that we can modify the existing code to provide more data without changing the existing code.


    */
}
