package Java.J_se_les7.HW.task1;

public class Eggs extends Food {
    protected int amountInPack;

    public Eggs(String name, int price, int amount, String unit, String eatTo, int amountInPack) {
        super(name, price, amount, unit, eatTo);
        this.amountInPack = amountInPack;
    }

    public Eggs() {
        super();
    }

    @Override
    public String toString() {
        return String.format("%sAmount in pack:%d", super.toString(), amountInPack);
    }
}
