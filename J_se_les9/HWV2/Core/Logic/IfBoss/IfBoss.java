package Java.J_se_les9.HWV2.Core.Logic.IfBoss;

import Java.J_se_les9.HWV2.Core.Animals.Wild.Wolf;
import Java.J_se_les9.HWV2.Core.Interfaces.IIfBoss;

public class IfBoss<T extends Wolf> implements IIfBoss {
    @Override
    public void showBoss(Wolf wolf) {
        if (wolf.ifBoss() == false) {
            System.out.printf("This %s is slave", wolf.getClass().getSimpleName());
        } else {
            System.out.printf("This %s is boss of this gym", wolf.getClass().getSimpleName());
        }
    }
}
