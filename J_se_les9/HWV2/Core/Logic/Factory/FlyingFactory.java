package Java.J_se_les9.HWV2.Core.Logic.Factory;

import Java.J_se_les9.HWV2.Core.Animals.Bird.BirdBase;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleErr;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleIn;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleOutFly;
import Java.J_se_les9.HWV2.Core.Interfaces.IFlyingFactory;
import Java.J_se_les9.HWV2.Core.Interfaces.IMenu;

public class FlyingFactory implements IFlyingFactory {
    private int hight;

    @Override
    public void flying(BirdBase bird, IConsoleIn input, IConsoleOutFly fly, IConsoleErr error, IMenu menu) {
        String choose = "";
        while (!choose.equals("0")) {
            menu.showMenu();
            choose = input.setStringData();
            switch (choose) {
                case "1":
                    fly.showHight(getHight());
                    break;
                case "2":
                    fly.askHigh();
                    setHight(input.setNumberData());
                    fly.flying();
                    break;
                case "3":
                    fly.stopToFly();
                    setHight(0);
                    break;
                case "0":
                    break;
                default:
                    error.commandError();
                    break;
            }
        }
    }

    public void setHight(int tmp) {
        if (tmp > 0) {
            this.hight = tmp;
        }
    }

    public int getHight() {
        return this.hight;
    }
}
