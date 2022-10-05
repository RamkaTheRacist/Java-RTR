package Java.J_se_les9.HW.Classes.Animals.CurrentAnimals;

import java.util.Scanner;

import Java.J_se_les9.HW.Classes.Animals.Bird;

public class Chicken extends Bird {
    public Chicken(Integer hight, Integer weight, String eyeColor) {
        super(hight, weight, eyeColor);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s is cackling\n", getClass().getSimpleName());
    }

    @Override
    public void flying() {
        Boolean end = false;
        Scanner iScanner = new Scanner(System.in);
        while (end == false) {
            System.out.println("(1)Start to fly, (2)check current position or (0)leave?");
            int choose = iScanner.nextInt();
            if (choose == 1) {
                System.out.println("Choose altitude: ");
                int altitude = iScanner.nextInt();
                if (altitude > 5) { // Ограничение полета
                    System.out.println("Chickens cant fly so high");
                } else {
                    setHightOfFly(altitude);
                }
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
