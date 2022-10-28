package Java.J_se_les12.HW.Core.UI.ConsoleOutput;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IMainMenu;

public class MainMenu2 implements IMainMenu {

    @Override
    public void showMainMenu() {
        System.out.println(
                "(1)Next contact\n(2)Prev contact\n(3)Remove this contact\n(4)Update this contact\n(0)Back\n");
    }

}
