package behavior.observer;

/**
 * Created by manish.sharan on 04/09/16
 */
public interface Observer {

    public void updatePrice(int infyPrice, int tcsPrice);

    public String getPrices();
}
