package behavior.strategy;

/**
 * Created by manish.sharan on 04/09/16.
 */
public class Brazil extends Team {

    public Brazil(String teamName, Strategy strategy){
        this.teamName = teamName;
        this.teamStrategy = strategy;
    }

    @Override
    public String printInfo() {
        return teamName + " playing with "+ teamStrategy;
    }
}
