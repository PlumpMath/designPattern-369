package behavior.strategy;

/**
 * Created by manish.sharan on 04/09/16
 */
public class AttackStrategy implements Strategy {
    @Override
    public String getStrategy() {
        return "attack";
    }

    @Override
    public String toString(){
        return "attack";
    }
}
