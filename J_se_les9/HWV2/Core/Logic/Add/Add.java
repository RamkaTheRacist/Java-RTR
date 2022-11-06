package Java.J_se_les9.HWV2.Core.Logic.Add;

import Java.J_se_les9.HWV2.Core.Animals.Bird.Chicken;
import Java.J_se_les9.HWV2.Core.Animals.Bird.Stork;
import Java.J_se_les9.HWV2.Core.Animals.Pet.Cat;
import Java.J_se_les9.HWV2.Core.Animals.Pet.Dog;
import Java.J_se_les9.HWV2.Core.Animals.Wild.Tiger;
import Java.J_se_les9.HWV2.Core.Animals.Wild.Wolf;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleIn;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleOut;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleSuc;
import Java.J_se_les9.HWV2.Core.Zoo.Zoo;

public class Add extends AddBase {

    public Add(Zoo zooList, IConsoleIn input, IConsoleOut output, IConsoleSuc suc) {
        super(zooList, input, output, suc);
    }

    @Override
    public void addAnimal(int type) {
        output.askForHight();
        int hight = input.setNumberData();
        output.askForWeight();
        int weight = input.setNumberData();
        output.askForEyeColor();
        String eyeColor = input.setStringData();
        if ((type == 1) || (type == 2)) {
            output.askForName();
            String name = input.setStringData();
            output.askForBreed();
            String breed = input.setStringData();
            output.askForGrafted();
            String grafted = input.setStringData();
            output.askForHairColor();
            String hairColor = input.setStringData();
            output.askForBD();
            String birthDay = input.setStringData();
            if (type == 1) {
                output.askForHairs();
                Boolean hairs = input.setBooleanData();
                zooList.add(new Cat(hight, weight, eyeColor, name, breed, grafted, hairColor, birthDay, hairs));
            } else {
                output.askForTrainig();
                Boolean training = input.setBooleanData();
                zooList.add(new Dog(hight, weight, eyeColor, name, breed, grafted, hairColor, birthDay, training));
            }
        } else if ((type == 3) || (type == 4)) {
            output.askForLivLoc();
            String livingLocation = input.setStringData();
            output.askForLocData();
            String locationData = input.setStringData();
            if (type == 3) {
                zooList.add(new Tiger(hight, weight, eyeColor, livingLocation, locationData));
            } else {
                output.askForBoss();
                Boolean bossOfThisGym = input.setBooleanData();
                zooList.add(new Wolf(hight, weight, eyeColor, livingLocation, locationData, bossOfThisGym));
            }
        } else {
            if (type == 5) {
                zooList.add(new Chicken(hight, weight, eyeColor));
            } else {
                zooList.add(new Stork(hight, weight, eyeColor));
            }
        }
        suc.addSuc();
    }
}
