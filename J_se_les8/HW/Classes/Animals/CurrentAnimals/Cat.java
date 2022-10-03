package Java.J_se_les8.HW.Classes.Animals.CurrentAnimals;

import Java.J_se_les8.HW.Classes.Animals.Pet;

public class Cat extends Pet {
    private String hairs;

    public Cat(Integer hight, Integer weight, String eyeColor, String name, String breed, String grafted,
            String hairColor, String birthDay, String hairs) {
        super(hight, weight, eyeColor, name, breed, grafted, hairColor, birthDay);
        this.hairs = hairs;
    }

    @Override
    public void weasel() {
        System.out.printf("%s is rubbing against your legs\n", getName());
    }

    @Override
    public void makeSound() {
        System.out.printf("%s is purring\n", getName());
    }

    @Override
    public String getInfo() {
        if (getHairColor() != null) {
            return String.format(
                    "Name: %s\nBreed: %s\nBD: %s\nHight: %d\nWeight: %d\nEye color: %s\nHair color: %s\nGrafted: %s\n",
                    getName(), getBreed(), getBD(), getHight(), getWeight(), getEyeColor(), getHairColor(),
                    getGrafted());
        } else {
            return String.format(
                    "Name: %s\nBreed: %s\nBD: %s\nHight: %d\nWeight: %d\nEye color: %s\nHairs: %s\nGrafted: %s\n",
                    getName(), getBreed(), getBD(), getHight(), getWeight(), getEyeColor(), hairs, getGrafted());
        }

    }

    public void getInfoAboutHair() {
        System.out.printf("About %s`s hairs: %s\n", getName(), hairs);
    }

}
