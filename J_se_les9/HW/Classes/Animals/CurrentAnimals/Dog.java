package Java.J_se_les9.HW.Classes.Animals.CurrentAnimals;

import Java.J_se_les9.HW.Classes.Animals.Pet;

public class Dog extends Pet {
    private String training;

    public Dog(Integer hight, Integer weight, String eyeColor, String name, String breed, String grafted,
            String hairColor, String birthDay, String training) {
        super(hight, weight, eyeColor, name, breed, grafted, hairColor, birthDay);
        this.training = training;
    }

    @Override
    public void weasel() {
        System.out.printf("%s is waging its tail\n", getName());
    }

    @Override
    public void makeSound() {
        System.out.printf("%s is barking\n", getName());
    }

    public String getInfoAboutTraining() {
        return training;
    }

    public void train() {
        System.out.printf("%s is too lazy now\n", getName());
    }

}
