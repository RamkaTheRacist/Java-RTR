package Java.J_se_les7.HW.task1;

public class Milk extends Drinks {
    protected double fat;
    protected String eatTo;

    public Milk(String name, int price, int amount, String unit, int volume, double fat, String eatTo) {
        super(name, price, amount, unit, volume);
        this.fat = fat;
        this.eatTo = eatTo;
    }

    public Milk() {
        super();
    }

    @Override
    public String toString() {
        return String.format("%sFat:%f\nEat To:%s\n", super.toString(), fat, eatTo);
    }
}
