package Java.J_se_les9.HWV2.Core.Animals.Pet;

public class Dog extends PetBase {
    private Boolean training;

    public Dog(Integer hight, Integer weight, String eyeColor, String name, String breed, String grafted,
            String hairColor, String birthDay, Boolean trainig) {
        super(hight, weight, eyeColor, name, breed, grafted, hairColor, birthDay);
        this.training = trainig;
    }

    public Boolean getTrainig() {
        return training;
    }

}
