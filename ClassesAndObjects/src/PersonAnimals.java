import java.math.BigDecimal;

public class PersonAnimals {

    public static void main(String[] args) {
        Animal animal1 = new Animal("Maria", 2, "Star White", "Cat");
        Animal animal2 = new Animal("Tommy", 5, "Golden", "Dog");

        Animal[] animals = {animal1, animal2};

        Car car1 = new Car("Super 911", "Yellow", "Camara", "Porsche", BigDecimal.valueOf(135793.90));
        Car[] cars = {car1};
        Address address1 = new Address("Aprt No.1", "ABC", "XYZ", "Florida", "US", "200314");
        Person person1 = new Person("Alex", "McMathew", Gender.MALE, address1, cars);
        System.out.println(person1);
        Address address2 = new Address("Aprt No.2", "ABC", "XYZ", "Florida", "US", "200314");
        Person person2 = new Person("Mary", "Parmar", Gender.FEMALE, animals, address2);
        System.out.println(person2);
    }
}
