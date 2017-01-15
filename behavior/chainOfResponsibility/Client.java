package behavior.chainOfResponsibility;

/**
 * Created by manish.sharan on 27/10/16
 */
public class Client {

    public static void main(String[] args) {
        Employee teamLead = new TeamLead();
        Employee manager = new Manager();
        Employee hr = new HR();

        teamLead.setNextLevel(manager);
        manager.setNextLevel(hr);

        teamLead.applyLeave("manish", 10);
        teamLead.applyLeave("manish", 15);
        teamLead.applyLeave("manish", 21);
        teamLead.applyLeave("manish", 31);
    }

}

/**
 * Philosophy:
 * Chain of responsibility creates a chain of request processors who can either process the request sent by client or can put it
 * forward to another request processor next in the chain. A chain is created. The client sends the request to the first processor
 * in the chain. If the request is processed, then ok else it passes the responsibility to another request processor.
 */
