package Java.J_se_les9.HWV2.Core.Animals.Pet;

import Java.J_se_les9.HWV2.Core.Animals.Base.Base;

public abstract class PetBase extends Base {
    private String name;
    private String breed;
    private String grafted;
    private String hairColor;
    private String birthDay;

    protected PetBase(Integer hight, Integer weight, String eyeColor, String name, String breed, String grafted,
            String hairColor, String birthDay) {
        super(hight, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.grafted = grafted;
        this.hairColor = hairColor;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getGrafted() {
        return grafted;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getBD() {
        return birthDay;
    }
}