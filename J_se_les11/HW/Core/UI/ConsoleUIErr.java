package Java.J_se_les11.HW.Core.UI;

public class ConsoleUIErr implements IConsoleUIErr {
    public ConsoleUIErr() {

    }

    @Override
    public void emptyError() {
        System.out.println("Current phonebook is empty");
    }

    @Override
    public void errorIndex() {
        System.out.println("You dont have entry with such position");

    }

    @Override
    public void errorAdd() {
        System.out.println("Such entry exists already");

    }

}
