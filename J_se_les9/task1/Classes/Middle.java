package Java.J_se_les9.task1.Classes;

import Java.J_se_les9.task1.Classes.Base.Base;
import Java.J_se_les9.task1.Interfaces.ILearning;
import Java.J_se_les9.task1.Interfaces.IPlaying;
import Java.J_se_les9.task1.Interfaces.Iskipping;

public class Middle extends Base implements ILearning, IPlaying, Iskipping{

    @Override
    public void learning() {
        System.out.println("I hate to learn");
    }

    @Override
    public void playing() {
        System.out.println("I`m playing in MeinKampf");
    }
    @Override
    public void skipping() {
        System.out.println("I`m skipping classes");
    }

}
