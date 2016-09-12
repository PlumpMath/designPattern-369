package structural.bridge;

/**
 * Created by manish.sharan on 13/09/16.
 */
//Implementor
public abstract class ElectronicDevice {

    private int volume = 0;

    public void volumeUp(){
        volume++;
        System.out.println(volume);
    }
    public void volumeDown(){
        volume--;
        System.out.println(volume);
    }

    public abstract void performAction();
}
