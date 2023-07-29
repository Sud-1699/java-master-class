package genericMethods;

public class GenericMethod {
    public static void main(String[] args) {
        String[] names = {"ABC", "XYZ"};
        Character[] chars = {'a', 'b', 'c'};

        print(names);
        print(chars);
        System.out.println();
        System.out.println("Print with return");
        for(String name: names) {
            System.out.println(returnPrint(name));
        }
    }

    static <T> void print(T[] array) {
        System.out.println("Print with no return");
        for(T e: array) {
            System.out.println(e.getClass().getName() + " - " + e);
        }
    }

    static <T> T returnPrint(T e) {
        return (T) (e.getClass().getName() + " - " + e);
    }
}
