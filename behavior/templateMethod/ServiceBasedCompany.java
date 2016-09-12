package behavior.templateMethod;

/**
 * Created by manish.sharan on 13/09/16.
 */
public class ServiceBasedCompany extends JoinCompany {
    @Override
    public void coverTopics() {
        System.out.println("Study tools");
    }

    @Override
    public void doHandsOn(){
        System.out.println("HandsOn not required");
    }
}
