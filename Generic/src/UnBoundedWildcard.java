import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UnBoundedWildcard {
    //? => Wildcard
    public static void main(String[] args) {
        List<Object> list1 = Arrays.asList(1, new Date());
        List<Integer> list2 = Arrays.asList(1, 2);
        List<String> list3 = Arrays.asList("1", "2");
        print(list1);
        print(list2);
        print(list3);
    }

    static void print(List<?> arrays) {
        arrays.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
