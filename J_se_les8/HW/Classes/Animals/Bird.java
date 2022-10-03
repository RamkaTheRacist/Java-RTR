package Java.J_se_les8.HW.Classes.Animals;

import Java.J_se_les8.HW.Classes.Animals.Base.BaseAnimal;

public abstract class Bird extends BaseAnimal {
    private Integer hightOfFly;

    public Bird(Integer hight, Integer weight, String eyeColor) {
        super(hight, weight, eyeColor);
    }

    protected Integer getHightOfFly() {
        return hightOfFly;
    }

    public void setHightOfFly(int any) {
        if(any <= 0){
            any = 0;
        }
        hightOfFly = any;
    }

    public void flying() {
        if (getHightOfFly() == null || getHightOfFly() < 1) {
            System.out.println("I`m on ground yet");
        } else {
            System.out.printf("I`m flying at an altitude of %d meters\n", getHightOfFly());
        }
    }
}
