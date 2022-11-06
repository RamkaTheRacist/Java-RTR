package Java.J_se_les9.HWV2.Core.Logic.MakingSounds;

import Java.J_se_les9.HWV2.Core.Animals.Base.Base;
import Java.J_se_les9.HWV2.Core.Animals.Pet.Cat;
import Java.J_se_les9.HWV2.Core.Animals.Pet.Dog;
import Java.J_se_les9.HWV2.Core.Interfaces.ImakeSound;

public class MakeSounds implements ImakeSound {
    @Override
    public void makeSound(Base base) {
        switch (base.getClass().getSimpleName()) {
            case "Cat":
                System.out.printf("%s is purring\n", ((Cat) base).getName());
                break;
            case "Dog":
                System.out.printf("%s is barking\n", ((Dog) base).getName());
                break;
            case "Stork":
                System.out.printf("%s is cracking its beak\n", base.getClass().getSimpleName());
                break;
            case "Chicken":
                System.out.printf("%s is cackling\n", base.getClass().getSimpleName());
                break;
            case "Tiger":
                System.out.printf("%s is growling\n", base.getClass().getSimpleName());
                break;
            case "Wolf":
                System.out.printf("%s is howling\n", base.getClass().getSimpleName());
                break;
        }
    }
}
