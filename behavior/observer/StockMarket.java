package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manish.sharan on 04/09/16
 */
public class StockMarket implements Subject {

    private List<Observer> stockObservers;
    private int infyPrice;
    private int tcsPrice;


    public StockMarket(int tcsPrice, int infyPrice){
        this.stockObservers = new ArrayList<>();
        this.tcsPrice = tcsPrice;
        this.infyPrice = infyPrice;
    }

    @Override
    public void subscribe(Observer observer) {
        stockObservers.add(observer);
        System.out.println("New observer added" + observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        stockObservers.remove(observer);
        System.out.println("Deleted observer "+ observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : stockObservers){
            observer.updatePrice(infyPrice, tcsPrice);
        }
    }

    public void setInfyPrice(int infyPrice){
        this.infyPrice = infyPrice;
        notifyObservers();
    }

    public void setTcsPrice(int tcs){
        this.tcsPrice = tcs;
        notifyObservers();
    }
}
