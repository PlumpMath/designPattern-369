package behavioral.strategy;

/**
 * Created by manish.sharan on 04/09/16.
 */
public abstract class Team {

    public String teamName;
    public Strategy teamStrategy;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Strategy getTeamStrategy() {
        return teamStrategy;
    }

    public void setTeamStrategy(Strategy teamStrategy) {
        this.teamStrategy = teamStrategy;
    }

    public abstract String printInfo();
}
