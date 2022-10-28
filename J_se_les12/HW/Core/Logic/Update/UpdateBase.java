package Java.J_se_les12.HW.Core.Logic.Update;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleInput;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public abstract class UpdateBase {
    Phonebook phonebook;
    IConsoleInput input;

    protected UpdateBase(Phonebook phonebook, IConsoleInput input) {
        this.phonebook = phonebook;
        this.input = input;
    }

    public abstract void update(int index);
}