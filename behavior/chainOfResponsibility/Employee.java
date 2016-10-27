package behavior.chainOfResponsibility;

/**
 * Created by manish.sharan on 27/10/16
 */
public abstract class Employee {

    protected Employee nextLevel;

    void setNextLevel(Employee employee) {
        this.nextLevel = employee;
    }

    abstract void applyLeave(String empName, int leaveDays);

}
