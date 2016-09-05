package behavior.observer;

/**
 * Created by manish.sharan on 04/09/16
 */
public class Client {

    public static void main(String[] args) {
        //market open
        StockMarket subject = new StockMarket(100, 150);
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        subject.subscribe(observer1);
        subject.subscribe(observer2);

        subject.setInfyPrice(120);
        subject.setTcsPrice(130);

        System.out.println(observer1.getPrices());
        System.out.println(observer2.getPrices());

        subject.setInfyPrice(140);
        subject.setTcsPrice(150);

        System.out.println(observer1.getPrices());
        System.out.println(observer2.getPrices());

        subject.unsubscribe(observer2);

        subject.setInfyPrice(130);
        subject.setTcsPrice(110);

        System.out.println(observer1.getPrices());
        System.out.println(observer2.getPrices());

    }

    /*
    Philosophy:
    When change in one object's attribute needs to be propagated to other classes, this pattern is used. Make the object a subject and add the attribute change listening
       classes as subscibers to it. This can be done at runtime. Then any change propagates automatically to the other classes.

       This is cleaner as the subject is not required to change when adding or removing a subscriber. Any subscriber can come and subscribe to the subject and a change
       in the attribute would get propagated to it at runtime.

    */
}
