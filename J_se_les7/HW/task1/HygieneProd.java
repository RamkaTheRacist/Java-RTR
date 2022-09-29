package Java.J_se_les7.HW.task1;

public class HygieneProd extends Base{
    protected int amountInPack;
    public HygieneProd(String name, int price, int amount, String unit, int amountInPack){
        super(name, price, amount, unit);
        this.amountInPack = amountInPack;
    }
    public HygieneProd(){
        super();
    }
    @Override
    public String toString(){
        return String.format("%sAmount in pack:%d\n", super.toString(), amountInPack);
    }
}
