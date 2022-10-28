package Java.J_se_les12.HW.Core.Logic.Remove;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutErrors;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutSuc;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public class RemoveV1 extends RemoveBase {

    public RemoveV1(Phonebook phonebook, IConsoleOutSuc outSuc, IConsoleOutErrors error) {
        super(phonebook, outSuc, error);

    }

    @Override
    public void remove(int index) {
        if (this.phonebook.sizeOfBook() > 0) {
            this.phonebook.remove(index);
            outSuc.removeSuccess();
        }
    }
}