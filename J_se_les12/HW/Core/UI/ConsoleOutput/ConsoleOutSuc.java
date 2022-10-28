package Java.J_se_les12.HW.Core.UI.ConsoleOutput;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutSuc;

public class ConsoleOutSuc implements IConsoleOutSuc {

    @Override
    public void updateSuccess() {
        System.out.println("Entry successfully updated");
    }

    @Override
    public void saveSuccess() {
        System.out.println("Entry successfully saved");
    }

    @Override
    public void removeSuccess() {
        System.out.println("Entry successfully removed");
    }

    @Override
    public void addSuccess() {
        System.out.println("Entry successfully added");
    }
}
