import java.util.List;

public class AreaCalculator implements IAreaCalculator {
    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        if(shapes.isEmpty()) {
           return 0;
        }
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
}