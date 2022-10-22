package Java.J_se_les11.HW.Core.Logic.RemoveLogic;

import Java.J_se_les11.HW.Core.Logic.Contact.Contact;
import Java.J_se_les11.HW.Core.Logic.MVP.Model;
import Java.J_se_les11.HW.Core.Logic.Phonebook.Phonebook;

public class Remove implements IRemove {
    Phonebook phonebook;
    Model model;

    public Remove(Phonebook phonebook, Model model) {
        this.phonebook = phonebook;
        this.model = model;
    }

    @Override
    public void remove() {
        Contact contact = model.currentContact();
        model.currentBook().remove(contact);
        if (model.getIndex() == model.currentBook().sizeOfBook()) {
            model.setIndex(model.getIndex() - 1);
        } else {
            model.setIndex(model.getIndex());
        }
    }


}
