package Java.J_se_les7.task1;

public class Moto extends Base{
    public Moto(String color, String model, int wheels, int weight, int speed){
        super(color, model, wheels, weight, speed);
    }
    public Moto(){
        super();
    }

    public String getInfo(){
        return String.format("Type: %s, %s", this.getClass().getSimpleName(), super.getInfo());
    }
    public void move(){
        System.out.printf("%s is moving\n", this.getClass().getSimpleName());
    }
}
