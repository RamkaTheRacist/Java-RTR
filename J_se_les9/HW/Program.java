package Java.J_se_les9.HW;

import Java.J_se_les9.HW.Classes.Zoo.Zoo;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Zoo zoo = new Zoo();
        zoo.addAnimalDefault();
        Boolean end = false;
        int choose = -1;
        Scanner iScanner = new Scanner(System.in);
        while (end == false) {
            System.out.println(
                    "Hello, you`re in Zoo. You can: (1)Add animal in zoo, (2)Remove animal in zoo, (3)Ask info about animal in zoo, (4)Ask info about all animals in zoo, (5)Force animal to make sounds, (6)Force all animals to make sounds, (7)Force animal to fly, (8)Force animal to weasel, (9) Force animal to train, (0)Leave zoo");
            choose = iScanner.nextInt();
            if (choose == 1) {
                System.out.println("Which animal: (1)Cat, (2)Dog, (3)Tiger, (4)Wolf, (5)Stork, (6)Chicken");
                int tmp = iScanner.nextInt();
                zoo.addAnimal(tmp);
            } else if (choose == 2) {
                System.out.println("Which animal: ");
                int tmp = iScanner.nextInt();
                zoo.removeAnimal(tmp);
            } else if (choose == 3) {
                System.out.println("Which animal: ");
                int tmp = iScanner.nextInt();
                zoo.infoAbout(tmp);
            } else if (choose == 4) {
                zoo.infoAll();
            } else if (choose == 5) {
                System.out.println("Which animal: ");
                int tmp = iScanner.nextInt();
                zoo.makeSoundThis(tmp);
            } else if (choose == 6) {
                zoo.makeSoundAll();
            } else if (choose == 7) {
                System.out.println("Which animal: ");
                int tmp = iScanner.nextInt();
                zoo.flyAction(tmp);
            } else if (choose == 8) {
                System.out.println("Which animal: ");
                int tmp = iScanner.nextInt();
                zoo.weaselAction(tmp);
            } else if (choose == 9) {
                System.out.println("Which animal: ");
                int tmp = iScanner.nextInt();
                zoo.trainAction(tmp);
            } else if (choose == 0) {
                end = true;
                iScanner.close();
            } else {
                System.out.println("Choose right please");
            }
            choose = -1;

        }
    }
}