package Java.J_se_les9.HWV2.Core.Animals.Pet;

public class Cat extends PetBase {
    private Boolean hairs;

    public Cat(Integer hight, Integer weight, String eyeColor, String name, String breed, String grafted,
            String hairColor, String birthDay, Boolean hairs) {
        super(hight, weight, eyeColor, name, breed, grafted, hairColor, birthDay);
        this.hairs = hairs;
    }

    public Boolean getHairs() {
        return hairs;
    }
}
