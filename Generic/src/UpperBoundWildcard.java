import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UpperBoundWildcard {
    //Upper Bound wildcard add more restrict to the type
    public static void main(String[] args) {
        List<Double> list1 = Arrays.asList(1.0, 1.7);
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list3 = Arrays.asList();
        print(list1);
        print(list2);
        print(list3);
    }

    static void print(List<? extends Number> arrays) {
        arrays.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
