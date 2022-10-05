package Java.J_se_les9.HW.Classes.Animals.CurrentAnimals;

import Java.J_se_les9.HW.Classes.Animals.Animal;

public class Wolf extends Animal {
    private String bossOfThisGym;

    public Wolf(Integer hight, Integer weight, String eyeColor, String livingLocation, String locationData,
            String bossOfThisGym) {
        super(hight, weight, eyeColor, livingLocation, locationData);
        this.bossOfThisGym = bossOfThisGym;
    }

    @Override
    public void makeSound() {
        System.out.printf("%s is howling\n", getClass().getSimpleName());
    }

    @Override
    public String getInfo() {
        return String.format(
                "Name: %s\nHight: %d\nWeight: %d\nEye color: %s\nLiving location: %s\nLocation date: %s\nLeader: %s\n",
                getClass().getSimpleName(), getHight(), getWeight(), getEyeColor(), getLivingLoc(), getLocDate(),
                bossOfThisGym);
    }

    public void getInfoIfBoss() {
        System.out.printf("Is leader of pack: %s\n", bossOfThisGym);
    }
}
