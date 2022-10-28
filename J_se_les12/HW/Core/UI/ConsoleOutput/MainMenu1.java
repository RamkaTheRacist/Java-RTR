package Java.J_se_les12.HW.Core.UI.ConsoleOutput;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IMainMenu;

public class MainMenu1 implements IMainMenu {

    @Override
    public void showMainMenu() {
        System.out.println(
                "(1)Show all contacts\n(2)Show contact one by one\n(3)Show contact by index\n(4)Add contact\n(5)Save file\n(6)Save as\n(0)Leave\n");
    }

}
