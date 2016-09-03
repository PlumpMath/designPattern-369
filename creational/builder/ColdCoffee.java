package creational.builder;

/**
 * Created by manish.sharan on 31/08/16
 */
public class ColdCoffee extends Beverage {
    private String name = "cold coffee";

    public ColdCoffee(ColdCoffeeBuilder coldCoffeeBuilder){
        this.additiveLiquidQuantity = coldCoffeeBuilder.additiveLiquidQuantity;
        this.additiveLiquid = coldCoffeeBuilder.additiveLiquid;
        this.waterType = coldCoffeeBuilder.waterType;
        this.waterQuantity = coldCoffeeBuilder.waterQuantity;
        this.sugarQuantity = coldCoffeeBuilder.sugarQuantity;
    }
    
    public static class ColdCoffeeBuilder {
        private int waterQuantity;
        private int sugarQuantity;
        private String waterType;
        private String additiveLiquid;
        private String additiveLiquidQuantity;

        public ColdCoffeeBuilder setWaterQuantity(int waterQuantity) {
            this.waterQuantity = waterQuantity;
            return this;
        }

        public ColdCoffeeBuilder setSugarQuantity(int sugarQuantity) {
            this.sugarQuantity = sugarQuantity;
            return this;
        }

        public ColdCoffeeBuilder setWaterType(String waterType) {
            this.waterType = waterType;
            return this;
        }

        public ColdCoffeeBuilder setAdditiveLiquid(String additiveLiquid) {
            this.additiveLiquid = additiveLiquid;
            return this;
        }

        public ColdCoffeeBuilder setAdditiveLiquidQuantity(String additiveLiquidQuantity) {
            this.additiveLiquidQuantity = additiveLiquidQuantity;
            return this;
        }

        public ColdCoffee build(){
            return new ColdCoffee(this);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "ColdCoffee{" +
                "name='" + name + '\'' +
                '}';
    }
}
