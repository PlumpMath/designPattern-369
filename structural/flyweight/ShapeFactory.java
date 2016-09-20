package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manish.sharan on 21/09/16.
 */
public class ShapeFactory {

    private Map<String,Shape> shapeMap = new HashMap<>();

    public Shape getShapeObject(String shape){
        Shape shapeObject = null;
        switch(shape) {
            case "circle":
                shapeObject = new Circle();
                if(shapeMap.get(shape) == null) shapeMap.put(shape, shapeObject);
                else shapeObject = shapeMap.get(shape);
                break;
            default: return null;
        }
        return shapeObject;
    }
}
