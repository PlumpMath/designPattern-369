package structural.flyweight;

/**
 * Created by manish.sharan on 21/09/16.
 */
public class Circle implements Shape {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drew circle of color "+ color);
    }
}
