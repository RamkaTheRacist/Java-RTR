package Java.J_se_les12.HW.Core.Logic.Remove;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutErrors;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutSuc;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public abstract class RemoveBase {
    Phonebook phonebook;
    IConsoleOutSuc outSuc;
    IConsoleOutErrors error;

    protected RemoveBase(Phonebook phonebook, IConsoleOutSuc outSuc, IConsoleOutErrors error) {
        this.outSuc = outSuc;
        this.phonebook = phonebook;
        this.error = error;
    }

    public abstract void remove(int index);
}
