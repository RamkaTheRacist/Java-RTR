package Java.J_se_les9.HWV2.Core.Logic.Weasel;

import Java.J_se_les9.HWV2.Core.Animals.Base.Base;
import Java.J_se_les9.HWV2.Core.Animals.Pet.Cat;
import Java.J_se_les9.HWV2.Core.Animals.Pet.Dog;
import Java.J_se_les9.HWV2.Core.Interfaces.Iweasel;

public class Weasel implements Iweasel {

    @Override
    public void weasel(Base pet) {
        if (pet.getClass().getSimpleName().equals("Dog")) {
            System.out.printf("%s is waging its tail\n", ((Dog) pet).getName());
        } else if (pet.getClass().getSimpleName().equals("Cat")) {
            System.out.printf("%s is rubbing against your legs\n", ((Cat) pet).getName());
        }else{
            System.out.println("This animal cant weasel");
        }
    }
}
