package Java.J_se_les12.HW.Core.UI.ConsoleOutput;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutErrors;

public class ConsoleOutErrors implements IConsoleOutErrors {

    @Override
    public void indexError() {
        System.out.println("Entry with such index doesnt exist");
    }

    @Override
    public void emptyError() {
        System.out.println("Phonebook is empty");
    }

    @Override
    public void commandError() {
        System.out.println("Invalid command");
    }

    @Override
    public void addError() {
        System.out.println("Such entry is exist already");
    }
}
