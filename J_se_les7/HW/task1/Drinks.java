package Java.J_se_les7.HW.task1;

public class Drinks extends Base {
    protected int volume;

    public Drinks(String name, int price, int amount, String unit, int volume) {
        super(name, price, amount, unit);
        this.volume = volume;
    }

    public Drinks() {
        super();
    }

    @Override
    public String toString() {
        return String.format("%sVolume:%d\n", super.toString(), volume);
    }
}
