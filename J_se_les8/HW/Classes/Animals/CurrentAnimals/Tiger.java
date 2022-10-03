package Java.J_se_les8.HW.Classes.Animals.CurrentAnimals;

import Java.J_se_les8.HW.Classes.Animals.Animal;

public class Tiger extends Animal {
    public Tiger(Integer hight, Integer weight, String eyeColor, String livingLocation, String locationData) {
        super(hight, weight, eyeColor, livingLocation, locationData);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s is growling\n", getClass().getSimpleName());

    }

    @Override
    public String getInfo() {
        return String.format(
                "Name: %s\nHight: %d\nWeight: %d\nEye color: %s\nLiving location: %s\nLocation date: %s\n",
                getClass().getSimpleName(), getHight(), getWeight(), getEyeColor(), getLivingLoc(), getLocDate());
    }

}
