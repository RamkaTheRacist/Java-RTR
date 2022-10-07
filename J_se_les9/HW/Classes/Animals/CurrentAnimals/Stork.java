package Java.J_se_les9.HW.Classes.Animals.CurrentAnimals;

import Java.J_se_les9.HW.Classes.Animals.Bird;
import Java.J_se_les9.HW.Classes.ReadData.ReadData;

public class Stork extends Bird {
    public Stork(Integer hight, Integer weight, String eyeColor) {
        super(hight, weight, eyeColor);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s is cracking its beak\n", getClass().getSimpleName());
    }

    @Override
    public void flying() {
        Boolean end = false;
        ReadData tmpForFly = new ReadData();
        while (end == false) {
            System.out.println("(1)Set altitude for fly, (2)check current position or (0)leave?");
            tmpForFly.setIntValue();
            int choose = tmpForFly.getIntValue();
            if (choose == 1) {
                System.out.println("Choose altitude: ");
                tmpForFly.setIntValue();
                int altitude = tmpForFly.getIntValue();
                setHightOfFly(altitude);
            } else if (choose == 2) {
                if (getHightOfFly() == null || getHightOfFly() < 1) {
                    System.out.println("I`m on ground yet");
                } else {
                    System.out.printf("I`m flying at an altitude of %d meters\n", getHightOfFly());
                }
            } else if (choose == 0) {
                end = true;
            } else {
                System.out.println("Choose pls");
            }
        }
    }
}
