package Java.J_se_les7.HW.task1;

public class Diapers extends KidProd{
    protected int size;
    protected int minimalAge;
    protected int maxAge;
    protected String type;
    Diapers(String name, int price, int amount, String unit, int minAge, String hypoallergenic, int size,int minimalAge,int maxAge,String type){
        super(name, price, amount, unit, minAge, hypoallergenic);
        this.size = size;
        this.minimalAge = minimalAge;
        this.maxAge = maxAge;
        this.type = type;
    }
    public Diapers(){
        super();
    }
    @Override
    public String toString(){
        return String.format("%sSize:%d\nMinimal Age:%d\nMaximal Age:%d\nType:%s\n", super.toString(), size, minimalAge, maxAge,type);
    }
}
