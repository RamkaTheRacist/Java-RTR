package Java.J_se_les7.task1;
//Во всех классах должны быть написаны: цвет, модель, количество колёс, вес и скорость а так же метод ехать.
public class Base {
    protected String color;
    protected String model;
    protected int wheels;
    protected int weight;
    protected int speed;
    public Base(String color, String model, int wheels, int weight, int speed) {
        this.color = color;
        this.model = model;
        this.wheels = wheels;
        this.weight = weight;
        this.speed = speed;
    }
    public Base(){
        this("null", "null", 0, 0, 0);
    }
    public void move(){
        System.out.println("is moving");
    }
    public String getInfo(){
        return String.format("Model: %s, Color: %s, Count of wheels: %d, Weight: %d, Speed: %d", this.model, this.color, this.wheels, this.weight, this.speed);
    }
}
