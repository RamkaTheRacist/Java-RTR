package Java.J_se_les9.HWV2.Core.UI.ConsoleOut;

import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleOutFly;

public class ConsoleOutFly implements IConsoleOutFly{

    @Override
    public void showHight(int value) {
        if(value == 0){
            System.out.println("I`m at ground");
        }else{
            System.out.printf("I`m at %d altitude\n", value);
        }
    }

    @Override
    public void askHigh() {
        System.out.println("Altitude of flying: ");
    }

    @Override
    public void flying() {
       System.out.println("I`m starting to fly"); 
    }

    @Override
    public void stopToFly() {
        System.out.println("I landed on ground");
    }
}
