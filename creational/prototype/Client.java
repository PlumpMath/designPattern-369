package creational.prototype;

/**
 * Created by manish.sharan on 30/08/16
 */
public class Client {

    //Client creates a dog instance 1st time - All hard work is done here one time.
    //But second time, client passes the object to the clone creational.factory and gets a cloned object. (Ready made built-in object)

    public static void main(String[] args) {
        String animalType = "dog";

        AnimalCloneFactory animalCloneFactory = new AnimalCloneFactory();
        Animal animal = animalCloneFactory.createAnimal(animalType);
        System.out.println(animal);

        Animal animal2 = animalCloneFactory.createAnimal(animalType);
        System.out.println(animal2);

        Animal animal3 = animalCloneFactory.createAnimal("cat");
        System.out.println(animal3);

        Animal animal4 = animalCloneFactory.createAnimal("cat");
        System.out.println(animal4);
    }

    /*
    Philosophy:

     When heavy objects are to be created every time and "ALL" the attributes are the same for all the new objects, then we
     should go for Singleton Pattern, where as when we need different objects always where the majority of the attributes
     remain the same, only few attributes differ, then we should go for Prototype pattern.

     Here we create an object using new once and every other time Client asks for a object of the same type, we return
     a clone of the object instead of a new object, which saves cost.

     Here Client asks for a Animal type object. The clone factory has a map of the animal type and Animal object.
     First time the client asks, the clone factory created a new object and stores the same in the map as well.
     After that, it fetches the object from the map on every subsequent calls and the calls the clone on that object
     to fetch a new object. The new cloned object can be altered by playing with its properties.

     Another variance could be to create an object and pass the same to the clone factory (instead of the name)
     and call the clone method on the passed object to get a cloned object
     */
}
