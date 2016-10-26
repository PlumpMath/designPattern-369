package behavior.momento;

/**
 * Created by manish.sharan on 24/10/16
 */
public class Originator {

    private String stringMomento;

    public void set(String stringMomento){
        this.stringMomento = stringMomento;
    }

    public Momento storeInMomento(){
        return new Momento(stringMomento);
    }

    public String retrieveFromMomento(Momento momento){
        return momento.getStringMomento();
    }
}
