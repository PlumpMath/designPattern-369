package structural.facade;

/**
 * Created by manish.sharan on 19/09/16
 */
public class BankFacade {
    private int accNo;
    private ValidateAccNumber validateAccNumber;
    private BankAccount bankAccount;

    public BankFacade(int accNo){
        this.accNo = accNo;
        this.validateAccNumber = new ValidateAccNumber();
        this.bankAccount = new BankAccount();
    }

    public void deposit(int amount){
        validateAccNumber.validate(accNo);
        bankAccount.deposit(accNo, amount);
    }

    public void findBalance(){
        bankAccount.getBalance(accNo);
    }

    public void withdraw(int amount){
        validateAccNumber.validate(accNo);
        bankAccount.withdraw(accNo, amount);
    }
}
