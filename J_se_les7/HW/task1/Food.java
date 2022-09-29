package Java.J_se_les7.HW.task1;

public class Food extends Base {
    protected String eatTo;

    public Food(String name, int price, int amount, String unit, String eatTo) {
        super(name, price, amount, unit);
        this.eatTo = eatTo;
    }

    public Food() {
        super();
    }

    @Override
    public String toString() {
        return String.format("%sEat To:%s\n", super.toString(), eatTo);
    }
}
