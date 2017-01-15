package structural.adpater;

/**
 * Created by manish.sharan on 05/09/16
 */
public class Client {
    public static void main(String[] args) {
        IndiaDistance indiaDistance = new IndiaDistance(50);
        indiaDistance.process();
        DistanceAdapter distanceAdapter = new DistanceAdapterImpl();
        double miles = distanceAdapter.convertKmsToUSDistance(50);
        USDistance usDistance = new USDistance(miles);
        usDistance.process();
    }

    /*
    Philosophy:

    Get data from one type, convert it to a format acceptable to another type and pass that to it,
    such that code at both types remain the same.
     */
}