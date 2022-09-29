package Java.J_se_les7.HW.task1;

public class ToiletPaper extends HygieneProd{
    protected int numberOfLayers;
    public ToiletPaper(String name, int price, int amount, String unit, int amountInPack,int numberOfLayers){
        super(name, price, amount, unit,amountInPack);
        this.numberOfLayers = numberOfLayers;
    }
    public ToiletPaper(){
        super();
    }
    @Override
    public String toString(){
        return String.format("%sNumber of Layers:%d\n", super.toString(), numberOfLayers);
    }
    
}
