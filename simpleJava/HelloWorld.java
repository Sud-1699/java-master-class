package simpleJava;
import java.util.ArrayList;

/**
 * HelloWorld
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, this is java from vs code");
        System.out.println(getString());
        System.out.println(getObject().toString());
    }

    static String getString() {
        return "A message from method";
    }

    static ArrayList<Animal> getObject() {
        Animal animal1 = new Animal("Lion", "Africa");
        Animal animal2 = new Animal("Zebra", "Africa");
        Animal animal3 = new Animal("Kangaroo", "Australia");
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        return animals;
        // Animal animal = new Animal("Lion", "Africa");
        // return animal.toString();
    }
  }