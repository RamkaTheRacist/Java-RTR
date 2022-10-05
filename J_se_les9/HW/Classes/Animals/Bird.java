package Java.J_se_les9.HW.Classes.Animals;

import java.util.Scanner;

import Java.J_se_les9.HW.Classes.Animals.Base.BaseAnimal;
import Java.J_se_les9.HW.Interfaces.Iflying;

public abstract class Bird extends BaseAnimal implements Iflying {
    private Integer hightOfFly;

    public Bird(Integer hight, Integer weight, String eyeColor) {
        super(hight, weight, eyeColor);
    }

    protected Integer getHightOfFly() {
        return hightOfFly;
    }

    public void setHightOfFly(int any) {
        if (any <= 0) {
            any = 0;
        }
        hightOfFly = any;
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
                setHightOfFly(altitude);
            } else if (choose == 2) {
                if (getHightOfFly() == null || getHightOfFly() < 1) {
                    System.out.println("I`m on ground yet");
                } else {
                    System.out.printf("I`m flying at an altitude of %d meters\n", getHightOfFly());
                }
            }else if (choose == 0){
                end = true;
            }else{
                System.out.println("Choose pls");
            }
        }
    }
}
