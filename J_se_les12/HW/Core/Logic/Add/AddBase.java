package Java.J_se_les12.HW.Core.Logic.Add;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleInput;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public abstract class AddBase {
    Phonebook phonebook;
    IConsoleInput input;

    public AddBase(Phonebook phonebook, IConsoleInput input) {
        this.phonebook = phonebook;
        this.input = input;
    }

    public abstract void add();
}
