package creational.builder;

/**
 * Created by manish.sharan on 31/08/16
 */
public class Tea extends Beverage {
    private String name = "tea";

    public Tea(TeaBuilder teaBuilder){
        this.waterQuantity = teaBuilder.waterQuantity;
        this.sugarQuantity = teaBuilder.sugarQuantity;
        this.waterType = teaBuilder.waterType;
        this.additiveLiquid = teaBuilder.additiveLiquid;
        this.additiveLiquidQuantity = teaBuilder.additiveLiquidQuantity;
    }

    public static class TeaBuilder {
        private int waterQuantity;
        private int sugarQuantity;
        private String waterType;
        private String additiveLiquid;
        private String additiveLiquidQuantity;

        public TeaBuilder setWaterQuantity(int waterQuantity) {
            this.waterQuantity = waterQuantity;
            return this;
        }

        public TeaBuilder setSugarQuantity(int sugarQuantity) {
            this.sugarQuantity = sugarQuantity;
            return this;
        }

        public TeaBuilder setWaterType(String waterType) {
            this.waterType = waterType;
            return this;
        }

        public TeaBuilder setAdditiveLiquid(String additiveLiquid) {
            this.additiveLiquid = additiveLiquid;
            return this;
        }

        public TeaBuilder setAdditiveLiquidQuantity(String additiveLiquidQuantity) {
            this.additiveLiquidQuantity = additiveLiquidQuantity;
            return this;
        }

        public Tea build(){
            return new Tea(this);
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "Tea{" +
                "name='" + name + '\'' +
                '}';
    }
}
