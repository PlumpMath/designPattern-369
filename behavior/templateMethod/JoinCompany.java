package behavior.templateMethod;

/**
 * Created by manish.sharan on 13/09/16.
 */
public abstract class JoinCompany {

    public void joinCompany(){
        accumulatePreparationInformation();
        coverTopics();
        doHandsOn();
        giveInterview();
    }

    public void accumulatePreparationInformation(){
        System.out.println("Accumulating Information");
    }

    public abstract void coverTopics();

    public void doHandsOn(){
        System.out.println("HandsOn");
    }

    public void giveInterview(){
        System.out.println("Giving Interviews");
    }

}
