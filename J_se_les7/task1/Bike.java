package Java.J_se_les7.task1;

public class Bike extends Base{
    public Bike(String color, String model, int wheels, int weight, int speed){
        super(color, model, wheels, weight, speed);
    }
    public Bike(){
        super();
    }

    public String getInfo(){
        return String.format("Type: %s, %s", this.getClass().getSimpleName(), super.getInfo());
    }
    public void move(){
        System.out.printf("%s is moving\n", this.getClass().getSimpleName());
    }
}
