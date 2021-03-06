package behavior.visitor;

/**
 * Created by manish.sharan on 11/10/16
 */
public class Vodafone implements Element {

    private double smsCharges;
    private double callCharges;

    public Vodafone(double smsCharges, double callCharges){
        this.smsCharges = smsCharges;
        this.callCharges = callCharges;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public double getSmsCharges() {
        return smsCharges;
    }

    public double getCallCharges() {
        return callCharges;
    }
}
