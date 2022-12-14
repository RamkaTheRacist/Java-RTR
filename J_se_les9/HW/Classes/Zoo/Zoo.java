package Java.J_se_les9.HW.Classes.Zoo;

import java.util.ArrayList;

import Java.J_se_les9.HW.Classes.Animals.Bird;
import Java.J_se_les9.HW.Classes.Animals.Base.BaseAnimal;
import Java.J_se_les9.HW.Classes.Animals.CurrentAnimals.Cat;
import Java.J_se_les9.HW.Classes.Animals.CurrentAnimals.Chicken;
import Java.J_se_les9.HW.Classes.Animals.CurrentAnimals.Dog;
import Java.J_se_les9.HW.Classes.Animals.CurrentAnimals.Stork;
import Java.J_se_les9.HW.Classes.Animals.CurrentAnimals.Tiger;
import Java.J_se_les9.HW.Classes.Animals.CurrentAnimals.Wolf;
import Java.J_se_les9.HW.Classes.ReadData.ReadData;
import Java.J_se_les9.HW.Interfaces.Iweasel;

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
            ReadData tmpForZoo = new ReadData();
            System.out.printf("Hight: \n");
            tmpForZoo.setIntValue();
            int hight = tmpForZoo.getIntValue();
            System.out.printf("Weight: \n");
            tmpForZoo.setIntValue();
            int weight = tmpForZoo.getIntValue();
            System.out.printf("Eye color: \n");
            tmpForZoo.setStringValue();
            tmpForZoo.setStringValue();
            String eyeColor = tmpForZoo.getStringValue();
            if (any < 3) {
                System.out.printf("Name: \n");
                tmpForZoo.setStringValue();
                String name = tmpForZoo.getStringValue();
                System.out.printf("Breed: \n");
                tmpForZoo.setStringValue();
                String breed = tmpForZoo.getStringValue();
                System.out.printf("Grafted: \n");
                tmpForZoo.setStringValue();
                String grafted = tmpForZoo.getStringValue();
                System.out.printf("Hair color: \n");
                tmpForZoo.setStringValue();
                String hairColor = tmpForZoo.getStringValue();
                System.out.printf("BD: \n");
                tmpForZoo.setStringValue();
                String birthDay = tmpForZoo.getStringValue();
                if (any == 1) {
                    System.out.printf("Has hair: \n");
                    tmpForZoo.setStringValue();
                    String hairs = tmpForZoo.getStringValue();
                    Cat cat = new Cat(hight, weight, eyeColor, name, breed, grafted, hairColor, birthDay, hairs);
                    newZoo.add(cat);
                } else {
                    System.out.printf("Has train: \n");
                    tmpForZoo.setStringValue();
                    String training = tmpForZoo.getStringValue();
                    Dog dog = new Dog(hight, weight, eyeColor, name, breed, grafted, hairColor, birthDay, training);
                    newZoo.add(dog);
                }
            } else if (any > 2 & any < 5) {
                System.out.printf("Living location: \n");
                tmpForZoo.setStringValue();
                String livingLoc = tmpForZoo.getStringValue();
                System.out.printf("Location Date: \n");
                tmpForZoo.setStringValue();
                String locationDate = tmpForZoo.getStringValue();
                if (any == 3) {
                    Tiger tiger = new Tiger(hight, weight, eyeColor, livingLoc, locationDate);
                    newZoo.add(tiger);
                } else {
                    System.out.printf("Leader: \n");
                    tmpForZoo.setStringValue();
                    String bossOfThisGym = tmpForZoo.getStringValue();
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
            BaseAnimal tmp = newZoo.get(index);
            System.out.println(tmp.getInfo());

        } else {
            System.out.println("Error, you don`t have such animal");
        }
    }

    public void makeSoundThis(int index) {
        if (index >= 0 & index < newZoo.size()) {
            BaseAnimal tmp = newZoo.get(index);
            tmp.makeSound();

        } else {
            System.out.println("Error, you don`t have such animal");
        }
    }

    public void trainAction(int index) {
        if (index >= 0 & index < newZoo.size()) {
            if (newZoo.get(index) instanceof Dog) {
                Dog tmp = (Dog) newZoo.get(index);
                tmp.train();
            } else {
                System.out.println("Error, this animal can`t be trained");
            }
        } else {
            System.out.println("Error, you don`t have such animal");
        }
    }

    public void weaselAction(int index) {
        if (index >= 0 & index < newZoo.size()) {
            if (newZoo.get(index) instanceof Iweasel) {
                Iweasel tmp = (Iweasel) newZoo.get(index);
                tmp.weasel();
            } else {
                System.out.println("Error, this animal can`t weasel");
            }
        } else {
            System.out.println("Error, you don`t have such animal");
        }
    }

    public void flyAction(int index) {
        if (index >= 0 & index < newZoo.size()) {
            if (newZoo.get(index) instanceof Bird) {
                Bird tmp = (Bird) newZoo.get(index);
                tmp.flying();
            } else {
                System.out.println("Error, this animal can`t fly by itself");
            }
        } else {
            System.out.println("Error, you don`t have such animal");
        }

    }

    public void infoAll() {
        for (int i = 0; i < newZoo.size(); i++) {
            BaseAnimal tmp = newZoo.get(i);
            System.out.println(tmp.getInfo());
        }
    }

    public void makeSoundAll() {
        for (int i = 0; i < newZoo.size(); i++) {
            BaseAnimal tmp = newZoo.get(i);
            tmp.makeSound();
        }
    }

}
