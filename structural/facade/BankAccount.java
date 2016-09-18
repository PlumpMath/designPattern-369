package structural.facade;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manish.sharan on 19/09/16.
 */
public class BankAccount {

    private Map<Integer,Integer> accBalanceMap;

    public BankAccount(){
        this.accBalanceMap = new HashMap(){{put(100001, 1000); put(200001, 10);}};
    }

    public void getBalance(int accNum){
        System.out.println("Account Balance is "+ accBalanceMap.get(accNum));
    }

    public void deposit(int accNum, int amount){
        int amountBalance = accBalanceMap.get(accNum);
        accBalanceMap.put(accNum, amount+amountBalance);
        System.out.println("Amount deposited");
    }

    public void withdraw(int accNum, int amount){
        int amountBalance = accBalanceMap.get(accNum);
        if(amountBalance < amount) {
            System.out.println("Insufficient balance.");
            getBalance(accNum);
        }else{
            accBalanceMap.put(accNum, amountBalance - amount);
            getBalance(accNum);
        }
    }
}
