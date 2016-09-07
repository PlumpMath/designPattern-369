package structural.adpater;

/**
 * Created by manish.sharan on 08/09/16.
 */
public class DistanceAdapterImpl implements DistanceAdapter {
    @Override
    public double convertKmsToUSDistance(double distanceInKms) {
        return distanceInKms*0.4;
    }
}
