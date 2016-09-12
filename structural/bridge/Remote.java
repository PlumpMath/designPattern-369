package structural.bridge;

/**
 * Created by manish.sharan on 13/09/16.
 */
public abstract class Remote {

    ElectronicDevice electronicDevice;

    public Remote(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
    }

    public void increaseVolume(){
        electronicDevice.volumeUp();
    }

    public void decreaseVolume(){
        electronicDevice.volumeDown();
    }

    public abstract void pressCenterButton();
}
