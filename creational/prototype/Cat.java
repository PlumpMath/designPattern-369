package creational.prototype;

/**
 * Created by manish.sharan on 30/08/16.
 */
public class Cat implements Animal {
    @Override
    public Animal makeAnimal() {
        Animal catObject = null;
        try {
            catObject = (Cat) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return catObject;
    }

    @Override
    public String toString(){
        return "Created a Cat Object with hashcode: "+ System.identityHashCode(this);
    }
}
