package Java.J_se_les12.HW.Core.Logic.Import;

import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public abstract class ImportBase {
    Phonebook phonebook;
    private String path;

    protected ImportBase(String path, Phonebook phonebook) {
        this.path = path;
        this.phonebook = phonebook;
    }

    public String getPath() {
        return this.path;
    }

    public abstract void importFiles();
}
