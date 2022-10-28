package Java.J_se_les12.HW.Core.Logic.Update;

import Java.J_se_les12.HW.Core.Contact.Contact;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleInput;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutSuc;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public class UpdateV1 extends UpdateBase {
    IConsoleOutSuc outSuc;

    public UpdateV1(Phonebook phonebook, IConsoleInput input, IConsoleOutSuc outSuc) {
        super(phonebook, input);
        this.outSuc = outSuc;
    }

    @Override
    public void update(int index) {
        if (this.phonebook.sizeOfBook() > 0) {
            Contact contact = phonebook.getContact(index);
            contact.setfName(input.setfName());
            contact.setlName(input.setlName());
            contact.setOrganisation(input.setOrganisation());
            contact.setPhoneNumber(input.setPhoneNumber());
            contact.setNote(input.setNote());
            outSuc.updateSuccess();
        }
    }
}
