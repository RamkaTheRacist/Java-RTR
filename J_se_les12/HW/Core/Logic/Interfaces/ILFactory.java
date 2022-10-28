package Java.J_se_les12.HW.Core.Logic.Interfaces;

import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public interface ILFactory {
    void makeOperation(String path, String choose, Phonebook phonebook, IConsoleOutErrors errors, IConsoleOutput output, IConsoleOutSuc outSuc, IConsoleInput input);
}
