package creational.prototype;

/**
 * Created by manish.sharan on 30/08/16
 */
public class Dog implements Animal {
    @Override
    public Animal makeAnimal() {
        Animal dogObject = null;
        try {
            dogObject = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return dogObject;
    }

    @Override
    public String toString(){
        return "Created a Dog Object with hashcode: "+ System.identityHashCode(this);
    }
}
