package creational.builder;

/**
 * Created by manish.sharan on 31/08/16
 */
public abstract class Beverage {

    protected int waterQuantity;
    protected int sugarQuantity;
    protected String waterType;
    protected int saltQuantity;
    protected String additiveLiquid;
    protected String additiveLiquidQuantity;

    @Override
    public String toString() {
        return "Beverage{" +
                "waterQuantity=" + waterQuantity +
                ", sugarQuantity=" + sugarQuantity +
                ", waterType='" + waterType + '\'' +
                ", saltQuantity=" + saltQuantity +
                ", additiveLiquid='" + additiveLiquid + '\'' +
                ", additiveLiquidQuantity='" + additiveLiquidQuantity + '\'' +
                '}';
    }
}
