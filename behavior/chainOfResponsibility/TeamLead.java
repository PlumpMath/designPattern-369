package behavior.chainOfResponsibility;

/**
 * Created by manish.sharan on 27/10/16
 */
public class TeamLead extends Employee {

    static final int MAX_LEAVES_CAN_APPROVE = 10;

    @Override
    void applyLeave(String empName, int leaveDays) {
        if(leaveDays <= MAX_LEAVES_CAN_APPROVE){
            approveLeaves(empName);
        }else{
            nextLevel.applyLeave(empName, leaveDays);
        }
    }

    public void approveLeaves(String empName){
        System.out.println("Leaves approved by Team Lead for "+empName);
    }
}
