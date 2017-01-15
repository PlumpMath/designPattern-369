package structural.flyweight;

/**
 * Created by manish.sharan on 21/09/16
 */
public class Client {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        String[] color = {"red","white","black","blue","orange"};
        for(int i=0; i<5;i++) {
            Shape shape = shapeFactory.getShapeObject("circle");
            System.out.println(shape);
            if(shape instanceof Circle) ((Circle)shape).setColor(color[i]);
            shape.draw();
        }
    }
}

/*
Philosophy:

When same type of objects are required in bulk, and only few attributes vary among those objects, we can use this pattern.
Creating a new object every time is a heavy operation and consumes lot of memory. This can be reduced by creating a sample
object and storing it, and whenever a new object of same type is asked for, the same object created previously is returned.
Later with the returned object, the attributes can be altered for that object.

 */
