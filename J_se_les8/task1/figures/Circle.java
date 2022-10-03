package Java.J_se_les8.task1.figures;

public class Circle extends Figure{
    private double diameter;
    public Circle(double diameter){
        super(diameter);
        this.diameter = diameter;
    }

    @Override
    public double area() {
        return Math.PI*(Math.pow(diameter/2, 2));
    }

    @Override
    public double perimeterOrLenght() {
        return 2*Math.PI*(diameter/2);
    }

    @Override
    public String getInfo() {
        return String.format("Type: %s\nDiameter: %.2f\nArea: %.2f\nLenght: %.2f\n", getClass().getSimpleName(), diameter, area(),
                perimeterOrLenght());
    }
    

}
