package genericClasses;

public class Main {
    public static void main(String[] args) {
        Box<Phone> box = new Box<>();
        box.set(new Phone("Motorola"));
        System.out.println(box.get());

        Box<Letter> box1 = new Box<>();
        box1.set(new Letter("ABC", "XYZ"));
        System.out.println(box1.get());
    }
}