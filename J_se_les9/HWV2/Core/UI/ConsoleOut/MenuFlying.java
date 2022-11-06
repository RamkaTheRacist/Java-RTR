package Java.J_se_les9.HWV2.Core.UI.ConsoleOut;

import Java.J_se_les9.HWV2.Core.Interfaces.IMenu;

public class MenuFlying implements IMenu {

    @Override
    public void showMenu() {
        System.out.println(
                "(1)Check current altitude\n(2)Set altitude and start to fly\n(3)Stop to fly\n(0)Back to zoo\n");
    }
}
