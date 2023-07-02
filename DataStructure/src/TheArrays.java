import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        int[] numbers = {100, 200}; //Shorthand way to define array

        colors[0] = "yellow";
        colors[1] = "red";

        System.out.println(Arrays.toString(colors));

        System.out.println("Four way to loop an array");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        for (String color:
             colors) {
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);
    }
}
