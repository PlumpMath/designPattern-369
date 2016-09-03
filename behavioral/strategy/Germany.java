package behavioral.strategy;

/**
 * Created by manish.sharan on 04/09/16.
 */
public class Germany extends Team {

    public Germany(String teamName, Strategy strategy){
        this.teamName = teamName;
        this.teamStrategy = strategy;
    }

    @Override
    public String printInfo() {
        return teamName + " playing with "+ teamStrategy;
    }
}
