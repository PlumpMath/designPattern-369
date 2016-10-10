package behavior.visitor;

/**
 * Created by manish.sharan on 11/10/16
 */
public class Client {

    public static void main(String[] args) {

        Element airtel = new Airtel(0.5, 0.5);
        Element reliance = new Reliance(0.2, 0.3);
        Element vodafone = new Vodafone(0.3, 0.3);

        System.out.println("Normal Charges :");

        Visitor chargersVisitor = new ChargersVisitor();
        airtel.accept(chargersVisitor);
        reliance.accept(chargersVisitor);
        vodafone.accept(chargersVisitor);

        System.out.println("\nHoliday Charges :");

        Visitor holidayChargesVisitor = new HolidayChargesVisitor();
        airtel.accept(holidayChargesVisitor);
        reliance.accept(holidayChargesVisitor);
        vodafone.accept(holidayChargesVisitor);
    }
}

/**
 Philosophy:

 When we have classes defined and there is some behavior we need to add or update without touching the existing classes, e.g. here we have 3 classes defined, airtel,
 reliance and vodafone. Each have a defined sms anc call charge when the objects are initialized. But we want to have a different call and sms charges on a holiday for
 each of them.

 We can create new methods in each of the existing classes to add some additional charges for holidays.

 But instead we can use visitor pattern to make that change without touching the existing classes.

 We create a visitor interface and the implementing classes would take care of creating new behavior in the existing classes. The existing classes would have a accept
 method which would take a visitor type and return their own instance to that visitor type. Thus the visitor now has a handle over the element classes.
 The visitor will have a visit method which will take the element object and can alter the behavior based on implementation.
 Here the Charges Validator just accesses the call and sms charges for the element classes on a general day, whereas a HolidayChargesValidator adds some additional
 charges for a holiday to all the element classes, without touching them.
 */
