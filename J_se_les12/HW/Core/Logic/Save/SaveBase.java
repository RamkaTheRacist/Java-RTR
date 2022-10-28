package Java.J_se_les12.HW.Core.Logic.Save;

import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public abstract class SaveBase {
    Phonebook phonebook;

    protected SaveBase(Phonebook phonebook) {
        this.phonebook = phonebook;
    }

    public abstract void save(String type, String path);

}
