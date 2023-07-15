import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMap {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();

        map.put(1, new Person("ABC"));
        map.put(2, new Person("XYZ"));
        map.put(3, new Person("GTE"));
//        map.put(3, new Person("GTE")); //Duplicate will not display
//        map.put(3, new Person("GTE 1")); //With same key it will override person object

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey(4));
        System.out.println(map.get(2));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.isEmpty());
        map.entrySet().forEach(obj -> System.out.println(obj.getKey() + " " + obj.getValue()));
        map.forEach((key, person) -> {
            System.out.println(key + "-" + person);
        });
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
