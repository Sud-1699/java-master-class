import java.util.List;

public class ShapePrinter {
    IAreaCalculator areaCalculator;

    public ShapePrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    //Single Responsibility
    public String json(List<Shape> shapes) {
       return String.format("{ShapesSum: %s}",
               areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return String.format("Shapes_Sum,%s",
                areaCalculator.sum(shapes));
    }
}
