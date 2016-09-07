package structural.adpater;

/**
 * Created by manish.sharan on 08/09/16.
 */
public class IndiaDistance {
    private double distanceInKms;

    public IndiaDistance(double distanceInKms){
        this.distanceInKms = distanceInKms;
    }

    public void process(){
        System.out.println("India Distance = "+ distanceInKms+" kms.");
    }
}
