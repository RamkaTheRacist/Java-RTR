package Java.J_se_les9.HWV2.Core.Logic.Training;

import Java.J_se_les9.HWV2.Core.Animals.Base.Base;
import Java.J_se_les9.HWV2.Core.Animals.Pet.Dog;
import Java.J_se_les9.HWV2.Core.Interfaces.ITrainig;

public class Training implements ITrainig {

    @Override
    public void training(Base dog) {
        if (dog instanceof Dog) {
            if (((Dog) dog).getTrainig() == false) {
                System.out.printf("%s is too lazy now\n", ((Dog) dog).getName());
            } else {
                System.out.printf("%s is training now\n", ((Dog) dog).getName());
            }
        } else {
            System.out.println("This animal cant be trained");
        }
    }
}
