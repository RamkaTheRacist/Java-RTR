package Java.J_se_les8.HW.Classes.Animals;

import Java.J_se_les8.HW.Classes.Animals.Base.BaseAnimal;

public abstract class Animal extends BaseAnimal {
    private String livingLocation;
    private String locationData;

    public Animal(Integer hight, Integer weight, String eyeColor, String livingLocation, String locationData) {
        super(hight, weight, eyeColor);
        this.livingLocation = livingLocation;
        this.locationData = locationData;
    }

    protected String getLivingLoc() {
        return livingLocation;
    }

    protected String getLocDate() {
        return locationData;
    }

}
