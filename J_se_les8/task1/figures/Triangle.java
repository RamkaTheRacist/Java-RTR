package Java.J_se_les8.task1.figures;

public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        super(side1);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2) {
        this(side1, side1, side2);
    }

    public Triangle(double side1) {
        this(side1, side1, side1);
    }

    @Override
    public double area() {
        double tmp = (side1 + side2 + side3) / 2;
        return Math.sqrt((tmp * (tmp - side1) * (tmp - side2) * (tmp - side3)));
    }

    @Override
    public double perimeterOrLenght() {
        return side1 + side2 + side3;
    }

    @Override
    public String getInfo() {
        return String.format("Type: %s\nSides: %.2f, %.2f, %.2f\nArea: %.2f\nPerimeter: %.2f\n", getClass().getSimpleName(), side1, side2, side3, area(),
                perimeterOrLenght());
    }
}
