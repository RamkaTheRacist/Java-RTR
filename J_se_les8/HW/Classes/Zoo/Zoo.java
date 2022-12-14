package Java.J_se_les8.HW.Classes.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

import Java.J_se_les8.HW.Classes.Animals.Bird;
import Java.J_se_les8.HW.Classes.Animals.Base.BaseAnimal;
import Java.J_se_les8.HW.Classes.Animals.CurrentAnimals.Cat;
import Java.J_se_les8.HW.Classes.Animals.CurrentAnimals.Chicken;
import Java.J_se_les8.HW.Classes.Animals.CurrentAnimals.Dog;
import Java.J_se_les8.HW.Classes.Animals.CurrentAnimals.Stork;
import Java.J_se_les8.HW.Classes.Animals.CurrentAnimals.Tiger;
import Java.J_se_les8.HW.Classes.Animals.CurrentAnimals.Wolf;

public class Zoo {
    ArrayList<BaseAnimal> newZoo = new ArrayList<>();
    Cat cat = new Cat(30, 5, "Red", "Barsik", "Outsider", "No", "Gray", "Unknown", "Has");
    Dog dog = new Dog(35, 9, "Brown", "Pyos", "Outsider", "Yes", "Black", "Unknown", "Hasn`t");
    Tiger tiger = new Tiger(60, 20, "Brown", "Russia", "19.01.2019");
    Wolf wilf = new Wolf(52, 60, "White", "America", "30.12.2012", "null");
    Stork stork = new Stork(46, 8, "Brown");
    Chicken chicken = new Chicken(23, 4, "Black");

    public void addAnimalDefault() {
        newZoo.add(cat);
        newZoo.add(dog);
        newZoo.add(tiger);
        newZoo.add(wilf);
        newZoo.add(stork);
        newZoo.add(chicken);
    }

    public void addAnimal(int any) {
        if (any > 0 && any < 7) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Hight: \n");
            int hight = iScanner.nextInt();
            System.out.printf("Weight: \n");
            int weight = iScanner.nextInt();
            System.out.printf("Eye color: \n");
            String as = iScanner.nextLine();
            String eyeColor = iScanner.nextLine();
            if (any < 3) {
                System.out.printf("Name: \n");
                String name = iScanner.nextLine();
                System.out.printf("Breed: \n");
                String breed = iScanner.nextLine();
                System.out.printf("Grafted: \n");
                String grafted = iScanner.nextLine();
                System.out.printf("Hair color: \n");
                String hairColor = iScanner.nextLine();
                System.out.printf("BD: \n");
                String birthDay = iScanner.nextLine();
                if (any == 1) {
                    System.out.printf("Has hair: \n");
                    String hairs = iScanner.nextLine();
                    Cat cat = new Cat(hight, weight, eyeColor, name, breed, grafted, hairColor, birthDay, hairs);
                    newZoo.add(cat);
                } else {
                    System.out.printf("Has train: \n");
                    String training = iScanner.nextLine();
                    Dog dog = new Dog(hight, weight, eyeColor, name, breed, grafted, hairColor, birthDay, training);
                    newZoo.add(dog);
                }
            } else if (any > 2 & any < 5) {
                System.out.printf("Living location: \n");
                String livingLoc = iScanner.nextLine();
                System.out.printf("Location Date: \n");
                String locationDate = iScanner.nextLine();
                if (any == 3) {
                    Tiger tiger = new Tiger(hight, weight, eyeColor, livingLoc, locationDate);
                    newZoo.add(tiger);
                } else {
                    System.out.printf("Leader: \n");
                    String bossOfThisGym = iScanner.nextLine();
                    Wolf wolf = new Wolf(hight, weight, eyeColor, livingLoc, locationDate, bossOfThisGym);
                    newZoo.add(wolf);
                }
            } else {
                if (any == 6) {
                    Chicken chicken = new Chicken(hight, weight, eyeColor);
                    newZoo.add(chicken);
                } else {
                    Stork stork = new Stork(hight, weight, eyeColor);
                    newZoo.add(stork);
                }
            }
        } else {
            System.out.println("Error, you dont have such type of animal");
        }
    }

    public void removeAnimal(int index) {
        newZoo.remove(index);
    }

    public void infoAbout(int index) {
        if (index >= 0 & index < newZoo.size()) {
            var tmp = newZoo.get(index);
            System.out.println(tmp.getInfo());

        } else {
            System.out.println("Error, you don`t have such animal");
        }
    }

    public void makeSoundThis(int index) {
        if (index >= 0 & index < newZoo.size()) {
            var tmp = newZoo.get(index);
            tmp.makeSound();

        } else {
            System.out.println("Error, you don`t have such animal");
        }
    }

    public void infoAll() {
        for (int i = 0; i < newZoo.size(); i++) {
            var tmp = newZoo.get(i);
            System.out.println(tmp.getInfo());
        }
    }

    public void makeSoundAll() {
        for (int i = 0; i < newZoo.size(); i++) {
            var tmp = newZoo.get(i);
            tmp.makeSound();
        }
    }
}
