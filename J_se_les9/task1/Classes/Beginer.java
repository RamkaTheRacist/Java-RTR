package Java.J_se_les9.task1.Classes;

import Java.J_se_les9.task1.Classes.Base.Base;
import Java.J_se_les9.task1.Interfaces.ILearning;
import Java.J_se_les9.task1.Interfaces.IPlaying;

public class Beginer extends Base implements ILearning, IPlaying {

    @Override
    public void learning() {
        System.out.println("I love to learn");
    }

    @Override
    public void playing() {
        System.out.println("I`m playing with toys");
    }


}
