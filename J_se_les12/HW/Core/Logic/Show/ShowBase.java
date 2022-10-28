package Java.J_se_les12.HW.Core.Logic.Show;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutput;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public abstract class ShowBase {
    Phonebook phonebook;
    IConsoleOutput output;

    protected ShowBase(Phonebook phonebook, IConsoleOutput output) {
        this.output = output;
        this.phonebook = phonebook;
    }

    public abstract void showContact(int index);
}
