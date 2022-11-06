package Java.J_se_les9.HWV2.Core.Logic.IfHasHair;

import Java.J_se_les9.HWV2.Core.Animals.Pet.Cat;
import Java.J_se_les9.HWV2.Core.Interfaces.IIfHasHair;

public class IfHasHair<T extends Cat> implements IIfHasHair {

    @Override
    public void showHairs(Cat cat) {
        if (cat.getHairs() == true) {
            System.out.printf("%s has %s hairs\n", cat.getName(), cat.getHairColor());
        } else {
            System.out.printf("%s is bald\n", cat.getName());
        }
    }
}
