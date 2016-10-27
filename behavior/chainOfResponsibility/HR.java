package behavior.chainOfResponsibility;

/**
 * Created by manish.sharan on 27/10/16.
 */
public class HR extends Employee {

    static final int MAX_LEAVES_CAN_APPROVE = 30;

    @Override
    void applyLeave(String empName, int leaveDays) {
        if(leaveDays <= MAX_LEAVES_CAN_APPROVE){
            approveLeaves(empName);
        }else{
            System.out.println("Leaves can't be approved");
        }
    }

    public void approveLeaves(String empName){
        System.out.println("Leaves approved by HR for "+empName);
    }
}
