package Java.J_le_les8.task0;

public class AnyClass {
    public Integer value;

    public static Integer count;
    static{
        count = 0;
    }

    public AnyClass(){
        count++;
    }

    public void printCount(){
        System.out.println(count);
    }
        
    
    @Override
    public String toString() {
        return value.toString();
    }
    
}
