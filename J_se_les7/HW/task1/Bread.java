package Java.J_se_les7.HW.task1;

public class Bread extends Food{
    protected String flour;
    public Bread(String name, int price, int amount, String unit, String eatTo, String flour){
        super(name, price, amount, unit, eatTo);
        this.flour = flour;
    }
    public Bread(){
        super();
    }
    @Override
    public String toString(){
        return String.format("%sFlour`s type:%s\n", super.toString(), flour);
    }
}
