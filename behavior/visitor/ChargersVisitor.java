package behavior.visitor;

/**
 * Created by manish.sharan on 11/10/16
 */
public class ChargersVisitor implements Visitor {

    @Override
    public void visit(Element e) {
        System.out.println("\nCharges for "+ e.getClass().getSimpleName());
        System.out.println("Sms Charges: " + e.getSmsCharges());
        System.out.println("Call Charges: " +e.getCallCharges());
    }
}
