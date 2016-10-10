package behavior.visitor;

/**
 * Created by manish.sharan on 11/10/16
 */
public class HolidayChargesVisitor implements Visitor {

    @Override
    public void visit(Element e) {
        System.out.println("\nCharges for "+ e.getClass().getSimpleName());
        if(e instanceof Airtel) {
            System.out.println("Sms Charges: " + (e.getSmsCharges() + 0.5));
            System.out.println("Call Charges: " + (e.getCallCharges() + 0.5));
        }else{
            System.out.println("Sms Charges: " + (e.getSmsCharges() + 0.25));
            System.out.println("Call Charges: " + (e.getCallCharges() + 0.5));
        }
    }
}
