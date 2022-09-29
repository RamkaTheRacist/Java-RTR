package Java.J_se_les7.HW.task1;

public class Base {
    protected String name;
    protected int price;
    protected int amount;
    protected String unit;

    public Base(String name, int price, int amount, String unit) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }

    public Base() {
        this("null", 0, 0, "null");
    }

    @Override
    public String toString() {
        return String.format("Name:%s\nPrice:%d\nAmount:%d\nUnit:%s\n", name, price, amount, unit);
    }
}
