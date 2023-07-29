import java.util.Arrays;
import java.util.List;

public class LowerBoundWildcard {
    //lower Bound wildcard add more restrict to the type along with super class
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list3 = Arrays.asList();
        print(list2);
        print(list3);
    }

    static void print(List<? super Integer> arrays) {
        arrays.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
