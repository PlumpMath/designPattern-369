package creational.builder;

/**
 * Created by manish.sharan on 31/08/16
 */
public class Client {

    public static void main(String[] args) {
        Tea tea = new Tea.TeaBuilder().setWaterType("hot").setWaterQuantity(10).setSugarQuantity(1)
                .setAdditiveLiquid("milk").setAdditiveLiquidQuantity("20gm").build();
        System.out.println(tea);

        Tea sugarFreeTea = new Tea.TeaBuilder().setWaterType("hot").setWaterQuantity(10)
                .setAdditiveLiquid("milk").setAdditiveLiquidQuantity("20gm").build();
        System.out.println(sugarFreeTea);

        ColdCoffee coldCoffee = new ColdCoffee.ColdCoffeeBuilder().setWaterType("cold").setWaterQuantity(10).setSugarQuantity(10).setAdditiveLiquid("chocolate")
                .setAdditiveLiquidQuantity("20gm").build();
        System.out.println(coldCoffee);

        LimeSoda limeSoda = new LimeSoda.LimeSodaBuilder().setSaltQuantity(3).setWaterType("cold").setWaterQuantity(10)
                .setAdditiveLiquid("soda").setAdditiveLiquidQuantity("50ml").setSugarQuantity(2).build();
        System.out.println(limeSoda);
    }

    /*
    Philosophy:

    When creating object with variable number of objects, this can be used. We can specify the only attributes needed
    to create the object. This helps get rid of multiple constructors.

    */
}
