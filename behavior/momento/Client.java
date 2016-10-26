package behavior.momento;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by manish.sharan on 27/10/16
 */
public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a statement");
        String input = scanner.nextLine();

        Originator originator = new Originator();
        originator.set(input);
        CareTaker careTaker = new CareTaker(new ArrayList<>());
        careTaker.addMomento(originator.storeInMomento());

        int counter = 1;

        while(true){
            System.out.println("Enter a char : s - save, u - undo, r - redo, e - exit");
            input = scanner.next();

            switch(input){
                case "s":
                    System.out.println("Enter a statement");
                    scanner = new Scanner(System.in);
                    String nextInput = scanner.nextLine();

                    originator.set(nextInput);
                    careTaker.addMomento(originator.storeInMomento());
                    counter++;
                    break;

                case "u":
                    if(counter > 1) {
                        System.out.println(originator.retrieveFromMomento(careTaker.getMomento(counter-1)));
                        counter--;
                    }else{
                        System.out.println("Nothing to undo");
                    }
                    break;

                case "r":
                    if(counter < careTaker.getMomentoList().size()){
                        System.out.println(originator.retrieveFromMomento(careTaker.getMomento(counter)));
                        counter++;
                    }else{
                        System.out.println("Nothing to redo");
                    }
                    break;

                case "e":
                    System.out.println("Exiting");
                    System.exit(0);

                default:
                    System.out.println("Wrong input");
            }
        }
    }
}

/**
 * Philosophy:
 *
 * This is used to undo and redo things.
 *
 * Caretaker has a set of Momentos. Momentos are the states that needs to be saved. One of the state is chosen among all the momentos on a undo or redo.
 * The Originator takes care of current state. Current state is based on a counter. Client provides the current state index to the originator which is
 * passed to the caretaker to chose the required momento from the input index. The originator then takes out the required values from the chosen momento and
 * gives it to the client.
 */
