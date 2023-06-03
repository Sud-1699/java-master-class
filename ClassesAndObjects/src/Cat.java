import java.util.Objects;

//Classes are Template which use to create new Object
public class Cat {
    //Property
    private String name;
    private int age;
    private String color;

    //Default Constructor
    public Cat() {}

    //Constructor with parameters
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Multiple Constructor
    public Cat(String name) {
        this.name = name;
        this.age = 0;
    }

    //using this keyword inside constructor
    public Cat(String name, int age, String color) {
        this(name, age);
        this.color = color;
    }

    //Behaviour
    public void meow() {
        System.out.println(name + ": meow....");
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Getter
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //Get String representation of object NB: toString is override with superclass object
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    //Override the superclass object .equals() method with new logic and same for hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}
