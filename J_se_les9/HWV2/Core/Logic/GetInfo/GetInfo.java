package Java.J_se_les9.HWV2.Core.Logic.GetInfo;

import Java.J_se_les9.HWV2.Core.Animals.Base.Base;
import Java.J_se_les9.HWV2.Core.Animals.Pet.Cat;
import Java.J_se_les9.HWV2.Core.Animals.Pet.Dog;
import Java.J_se_les9.HWV2.Core.Animals.Pet.PetBase;
import Java.J_se_les9.HWV2.Core.Animals.Wild.WildBase;
import Java.J_se_les9.HWV2.Core.Animals.Wild.Wolf;
import Java.J_se_les9.HWV2.Core.Interfaces.IgetInfo;

public class GetInfo implements IgetInfo {
    @Override
    public void getInfo(Base base) {
        String result = String.format("Type: %s\nHeight: %d\nWeight: %d\nEye color: %s\n",
                base.getClass().getSimpleName(), base.getHight(), base.getWeight(), base.getEyeColor());
        if (base instanceof PetBase) {
            var tmp = (PetBase) base;
            result = String.format("%sName: %s\nBreed: %s\nGrafted: %s\nHair color: %s\nBD: %s\n", result,
                    tmp.getName(), tmp.getBreed(), tmp.getGrafted(), tmp.getHairColor(), tmp.getBD());
            if (base instanceof Cat) {
                result = String.format("%sHas hairs: %b\n", result, ((Cat) tmp).getHairs());
            } else {
                result = String.format("%sHas training: %b\n", result, ((Dog) tmp).getTrainig());
            }
        } else if (base instanceof WildBase) {
            var tmp = (WildBase) base;
            result = String.format("%sLiving Location: %s\nLocation data: %s\n", result, tmp.getLivingLoc(),
                    tmp.getLocDate());
            if (base instanceof Wolf) {
                result = String.format("%sBoss: %b\n", result,
                        ((Wolf) tmp).ifBoss());
            }
        }
        System.out.println(result);
    }
}
