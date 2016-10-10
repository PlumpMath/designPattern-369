package behavior.visitor;

/**
 * Created by manish.sharan on 11/10/16
 */
public interface Element {

    void accept(Visitor v);

    double getSmsCharges();

    double getCallCharges();
}
