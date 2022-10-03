package Java.J_se_les8.HW.Classes.Animals;

import Java.J_se_les8.HW.Classes.Animals.Base.BaseAnimal;

public abstract class Pet extends BaseAnimal {
    private String name;
    private String breed;
    private String grafted;
    private String hairColor;
    private String birthDay;

    public Pet(Integer hight, Integer weight, String eyeColor, String name, String breed, String grafted,
            String hairColor, String birthDay) {
        super(hight, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.grafted = grafted;
        this.hairColor = hairColor;
        this.birthDay = birthDay;
    }

    protected String getName() {
        return name;
    }

    protected String getBreed() {
        return breed;
    }

    protected String getGrafted() {
        return grafted;
    }

    protected String getHairColor() {
        return hairColor;
    }

    protected String getBD() {
        return birthDay;
    }

    public abstract void weasel();
}
