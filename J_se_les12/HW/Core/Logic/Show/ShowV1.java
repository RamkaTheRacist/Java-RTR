package Java.J_se_les12.HW.Core.Logic.Show;

import Java.J_se_les12.HW.Core.Contact.Contact;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutErrors;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutput;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public class ShowV1 extends ShowBase {
    IConsoleOutErrors error;

    public ShowV1(Phonebook phonebook, IConsoleOutput output, IConsoleOutErrors error) {
        super(phonebook, output);
        this.error = error;
    }

    @Override
    public void showContact(int index) {
        if (this.phonebook.sizeOfBook() > 0) {
            if (index < this.phonebook.sizeOfBook()) {
                Contact contact = phonebook.getContact(index);
                output.showEntryPos(index);
                output.getfName(contact.getfName());
                output.getlName(contact.getlName());
                output.getOrganisation(contact.getOrganisation());
                output.getPhoneNumber(contact.getPhoneNumber());
                output.getNote(contact.getNote());
            } else {
                error.indexError();
            }
        } else {
            error.emptyError();
        }

    }

    public void showAll() {
        if (this.phonebook.sizeOfBook() > 0) {
            for (int i = 0; i < this.phonebook.sizeOfBook(); i++) {
                showContact(i);
            }
        } else {
            error.emptyError();
        }

    }
}