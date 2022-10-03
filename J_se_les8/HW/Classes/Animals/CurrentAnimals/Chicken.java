package Java.J_se_les8.HW.Classes.Animals.CurrentAnimals;

import Java.J_se_les8.HW.Classes.Animals.Bird;

public class Chicken extends Bird {
    public Chicken(Integer hight, Integer weight, String eyeColor) {
        super(hight, weight, eyeColor);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s is cackling\n", getClass().getSimpleName());
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s\nHight: %d\nWeight: %d\nEye color: %s\n", getClass().getSimpleName(), getHight(),
                getWeight(), getEyeColor());
    }

}
