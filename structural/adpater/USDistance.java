package structural.adpater;

/**
 * Created by manish.sharan on 08/09/16.
 */
public class USDistance {
    private double distanceInMiles;

    public USDistance(double distanceInMiles){
        this.distanceInMiles = distanceInMiles;
    }

    public void process(){
        System.out.println("US Distance = "+ distanceInMiles+" miles.");
    }
}
