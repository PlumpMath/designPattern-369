package creational.builder;

/**
 * Created by manish.sharan on 31/08/16
 */
public class LimeSoda extends Beverage {
    
    private String name = "lime soda";

    public LimeSoda(LimeSodaBuilder limeSodaBuilder){
        this.waterQuantity = limeSodaBuilder.waterQuantity;
        this.waterType = limeSodaBuilder.waterType;
        this.sugarQuantity = limeSodaBuilder.sugarQuantity;
        this.additiveLiquidQuantity = limeSodaBuilder.additiveLiquidQuantity;
        this.additiveLiquid = limeSodaBuilder.additiveLiquid;
        this.saltQuantity = limeSodaBuilder.saltQuantity;
    }
    
    public static class LimeSodaBuilder{
        private int waterQuantity;
        private int sugarQuantity;
        private String waterType;
        private int saltQuantity;
        private String additiveLiquid;
        private String additiveLiquidQuantity;

        public LimeSodaBuilder setWaterQuantity(int waterQuantity) {
            this.waterQuantity = waterQuantity;
            return this;
        }

        public LimeSodaBuilder setSugarQuantity(int sugarQuantity) {
            this.sugarQuantity = sugarQuantity;
            return this;
        }

        public LimeSodaBuilder setWaterType(String waterType) {
            this.waterType = waterType;
            return this;
        }

        public LimeSodaBuilder setSaltQuantity(int saltQuantity) {
            this.saltQuantity = saltQuantity;
            return this;
        }

        public LimeSodaBuilder setAdditiveLiquid(String additiveLiquid) {
            this.additiveLiquid = additiveLiquid;
            return this;
        }

        public LimeSodaBuilder setAdditiveLiquidQuantity(String additiveLiquidQuantity) {
            this.additiveLiquidQuantity = additiveLiquidQuantity;
            return this;
        }

        public LimeSoda build(){
            return new LimeSoda(this);
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "LimeSoda{" +
                "name='" + name + '\'' +
                '}';
    }
}
