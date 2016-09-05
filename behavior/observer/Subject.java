package behavior.observer;

/**
 * Created by manish.sharan on 04/09/16
 */
public interface Subject {

    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void notifyObservers();
}
