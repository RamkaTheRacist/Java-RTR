package Java.J_se_les9.HW.Classes.Animals;

import Java.J_se_les9.HW.Classes.Animals.Base.BaseAnimal;
import Java.J_se_les9.HW.Interfaces.Iweasel;

public abstract class Pet extends BaseAnimal implements Iweasel {
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

    @Override
    public String getInfo() {
        return String.format("%sName: %s\nBreed: %s\nBD: %s\nHair color: %s\nGrafted: %s\n", super.getInfo(), getName(),
                getBreed(), getBD(),
                getHairColor(), getGrafted());
    }

    public abstract void weasel();

}
