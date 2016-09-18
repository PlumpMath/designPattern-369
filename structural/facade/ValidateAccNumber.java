package structural.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manish.sharan on 19/09/16.
 */
public class ValidateAccNumber {

    private List<Integer> accountNumbers;

    public ValidateAccNumber(){
        this.accountNumbers = new ArrayList<>();;
        this.accountNumbers.add(100001);
        this.accountNumbers.add(200001);
    }

    public void validate(int accountNumber){
        if(accountNumbers.contains(accountNumber)) System.out.println("Valid Acc Number");
        else System.out.println("Invalid Acc Number");
    }
}
