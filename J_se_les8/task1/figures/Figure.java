package Java.J_se_les8.task1.figures;
public abstract class Figure{
    private double side;
    public double getSide(){
        return side;
    }
    public Figure(double side){
        this.side = side;
    }

    public abstract double area();
    public abstract double perimeterOrLenght();
    public abstract String getInfo();
}
