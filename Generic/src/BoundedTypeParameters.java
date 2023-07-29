public class BoundedTypeParameters {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3};
        System.out.println(countGreaterNumber(numbers, 1));

        Double[] numbers1 = {1.0, 2.0, 3.0};
        System.out.println(countGreaterNumber(numbers1, 1.5));
    }

    static <T extends Comparable<T>> int countGreaterNumber(T[] numbers, T number) { //Bounded Type Parameters
        int count = 0;

        for(T n: numbers) {
            if(n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}
