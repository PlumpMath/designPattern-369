package creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manish.sharan on 30/08/16
 */
public class AnimalCloneFactory {

    private Map<String, Animal> animalMap = new HashMap<>();

    public Animal createAnimal(String animalType){
        Animal animal = null;
        if(animalMap.get(animalType) == null){

            switch(animalType){
                case "dog":
                    animal = new Dog();
                    break;
                case "cat":
                    animal = new Cat();
                    break;
                default:

            }
            animalMap.put(animalType, animal);
        }else{
            animal = animalMap.get(animalType).makeAnimal();
        }
        return animal;
    }
}
