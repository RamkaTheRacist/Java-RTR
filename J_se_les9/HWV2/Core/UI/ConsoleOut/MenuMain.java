package Java.J_se_les9.HWV2.Core.UI.ConsoleOut;

import Java.J_se_les9.HWV2.Core.Interfaces.IMenu;

public class MenuMain implements IMenu {

    @Override
    public void showMenu() {
        System.out.println(
                "(1)Add animal in zoo\n(2)Remove animal in zoo\n(3)Ask info about animal in zoo\n(4)Ask info about all animals in zoo\n(5)Force animal to make sounds\n(6)Force all animals to make sounds\n(7)Force animal to fly\n(8)Force animal to weasel\n(9)Force animal to train\n(0)Leave zoo");
    }
}
