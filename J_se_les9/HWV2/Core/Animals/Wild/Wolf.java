package Java.J_se_les9.HWV2.Core.Animals.Wild;

public class Wolf extends WildBase {
    private Boolean bossOfThisGym;

    public Wolf(Integer hight, Integer weight, String eyeColor, String livingLocation, String locationData,
            Boolean bossOfThisGym) {
        super(hight, weight, eyeColor, livingLocation, locationData);
        this.bossOfThisGym = bossOfThisGym;
    }

    public Boolean ifBoss() {
        return bossOfThisGym;
    }

}
