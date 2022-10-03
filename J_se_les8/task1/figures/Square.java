package Java.J_se_les8.task1.figures;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        super(side);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeterOrLenght() {
        return side * 4;
    }

    @Override
    public String getInfo() {
        return String.format("Type: %s\nSide: %.2f\nArea: %.2f\nPerimeter: %.2f\n", getClass().getSimpleName(), side, area(),
                perimeterOrLenght());
    }

}
