package simpleJava;
public class Animal {
    private String name;
    private String origin;

    public Animal(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", origin=" + origin + "]";
    }

}
