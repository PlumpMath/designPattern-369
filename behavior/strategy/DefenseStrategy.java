package behavior.strategy;

/**
 * Created by manish.sharan on 04/09/16.
 */
public class DefenseStrategy implements Strategy {
    @Override
    public String getStrategy() {
        return "defense";
    }

    @Override
    public String toString(){
        return "attack";
    }
}
