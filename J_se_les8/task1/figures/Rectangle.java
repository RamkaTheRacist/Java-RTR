package Java.J_se_les8.task1.figures;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        super(side1);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side1 * side2;
    }

    @Override
    public double perimeterOrLenght() {
        return side1 * 2 + side2 * 2;
    }

    @Override
    public String getInfo() {
        return String.format("Type: %s\nSides: %.2f, %.2f\nArea: %.2f\nPerimeter: %.2f\n", getClass().getSimpleName(), side1, side2, area(),
                perimeterOrLenght());
    }
}
