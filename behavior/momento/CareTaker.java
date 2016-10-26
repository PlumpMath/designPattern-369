package behavior.momento;

import java.util.List;

/**
 * Created by manish.sharan on 24/10/16
 */
public class CareTaker {

    public List<Momento> getMomentoList() {
        return momentoList;
    }

    private List<Momento> momentoList;

    public CareTaker(List<Momento> momentos){
        this.momentoList = momentos;
    }

    public void addMomento(Momento momento){
        this.momentoList.add(momento);
    }

    public Momento getMomento(int index){
        return momentoList.get(index);
    }
}
