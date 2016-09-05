package behavior.observer;

/**
 * Created by manish.sharan on 04/09/16.
 */
public class Observer1 implements Observer {

    private int infyPrice;
    private int tcsPrice;

    @Override
    public void updatePrice(int infyPrice, int tcsPrice) {
        this.infyPrice = infyPrice;
        this.tcsPrice = tcsPrice;
    }

    @Override
    public String getPrices() {
        return "Observer 1 :: InfyPrice "+ infyPrice + " Tcs Price "+ tcsPrice  ;
    }
}
