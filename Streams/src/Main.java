import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1. Find people aged less then or equal 18
        //2. Then change implementation to find first 10 people

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("abc", 26));
        persons.add(new Person("hjd", 18));
        persons.add(new Person("abfdc", 10));
        persons.add(new Person("335", 30));
        persons.add(new Person("asbc", 5));
        persons.add(new Person("abdjkc", 82));
        persons.add(new Person("ha", 1));
        persons.add(new Person("sd", 16));
        persons.add(new Person("dfh", 17));
        persons.add(new Person("djfh", 6));
        persons.add(new Person("duye", 7));
        persons.add(new Person("ahllj", 90));
        persons.add(new Person("afhbc", 11));
        persons.add(new Person("kad", 13));
        persons.add(new Person("akdh", 14));
        persons.add(new Person("owpi", 15));

        //Imperative Approach
//        imperativeApproach(persons);

        //Declarative Approach
        declarativeApproach(persons);
    }

    static void imperativeApproach(List<Person> persons) {
        List<Person> youngPeoples = new ArrayList<>();
        int limit = 10;
        for(Person person: persons) {
            if(person.getAge() <= 18) {
                if(limit == 0) {
                    break;
                }else {
                    youngPeoples.add(person);
                    limit--;
                }
            }
        }
        youngPeoples.forEach(System.out::println);
    }

    static void declarativeApproach(List<Person> persons) {
        List<Person> youngPeoples = persons.stream()
                .filter(p -> p.getAge() <= 18).limit(10)
                .collect(Collectors.toList());
        youngPeoples.forEach(System.out::println);
    }


}