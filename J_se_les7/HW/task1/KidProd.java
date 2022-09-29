package Java.J_se_les7.HW.task1;

public class KidProd extends Base {
    protected int minAge;
    protected String hypoallergenic;

    public KidProd(String name, int price, int amount, String unit, int minAge, String hypoallergenic) {
        super(name, price, amount, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public KidProd() {
        super();
    }

    @Override
    public String toString() {
        return String.format("%sMinimal Age:%d\nHypoallergenic:%s\n", super.toString(), minAge, hypoallergenic);
    }
}
