package Java.J_se_les12.HW.Core.UI.ConsoleOutput;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutput;

public class ConsoleOutput implements IConsoleOutput {

    @Override
    public void getfName(String value) {
        System.out.printf("First name: %s\n", value);
    }

    @Override
    public void getlName(String value) {
        System.out.printf("Last name: %s\n", value);
    }

    @Override
    public void getOrganisation(String value) {
        System.out.printf("Organisation: %s\n", value);
    }

    @Override
    public void getPhoneNumber(int value) {
        System.out.printf("Phone number: %d\n", value);
    }

    @Override
    public void getNote(String value) {
        System.out.printf("Note: %s\n\n", value);
    }

    @Override
    public void showEntryPos(int value) {
        System.out.printf("Position: %d\n", value + 1);
    }

}
