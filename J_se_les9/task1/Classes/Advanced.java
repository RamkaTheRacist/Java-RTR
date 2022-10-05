package Java.J_se_les9.task1.Classes;

import Java.J_se_les9.task1.Classes.Base.Base;
import Java.J_se_les9.task1.Interfaces.ILearning;
import Java.J_se_les9.task1.Interfaces.Ismoking;

public class Advanced extends Base implements ILearning, Ismoking{

    @Override
    public void learning() {
        System.out.println("I have to learn -_-");
        
    }
    @Override
    public void smoking() {
        System.out.println("I`m smoking");
    }
    
}
