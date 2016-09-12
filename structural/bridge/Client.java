package structural.bridge;

/**
 * Created by manish.sharan on 13/09/16
 */
public class Client {

    public static void main(String[] args) {
        Remote tvRemote = new TVRemote(new TV());
        Remote dvdRemote = new DVDRemote(new DVDPlayer());

        tvRemote.increaseVolume();
        tvRemote.increaseVolume();
        tvRemote.increaseVolume();
        tvRemote.pressCenterButton();
        tvRemote.decreaseVolume();

        dvdRemote.increaseVolume();
        dvdRemote.pressCenterButton();
        dvdRemote.decreaseVolume();
    }
}

/*
Philosophy:

Bridge pattern means to separate out the abstract/interface and implementation classes so that they remain independent.
The Remote here is an abstraction which has a reference to an implementor, a ElectronicDevice which is an abstract class. The remote is independent of actual implementation of the
ElectronicDevice classes. It just interacts with the methods of ElectronicDevice class. The ElectronicDevice class has an abstract method pressCenterButton.
The Remote is independent of how this would work with actual implementations of ElectronicDevice classes.

So because of this abstraction, we can have different behaviors to the abstractions. TVRemote when presses center button would mute the TV, while the center button of
DVDPlayer would pause it.

 */