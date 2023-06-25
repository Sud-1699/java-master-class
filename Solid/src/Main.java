import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        ShapePrinter printer = new ShapePrinter(areaCalculator);
        Square square = new Square(10);
        Cricle cricle = new Cricle(10);
        Cube cube = new Cube();
//        Shape noShape = new NoShape();

        List<Shape> shapes = Arrays.asList(square, cricle, cube);
        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}