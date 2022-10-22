package Java.J_se_les11.HW.Core.Logic.UpdateLogic;

import Java.J_se_les11.HW.Core.Logic.Contact.Contact;
import Java.J_se_les11.HW.Core.Logic.MVP.IView;
import Java.J_se_les11.HW.Core.Logic.MVP.Model;
import Java.J_se_les11.HW.Core.Logic.Phonebook.Phonebook;

public class Update implements IUpdate {
    Phonebook phonebook;
    Model model;
    IView view;

    public Update(Phonebook phonebook, Model model, IView view) {
        this.phonebook = phonebook;
        this.model = model;
        this.view = view;
    }

    @Override
    public void update() {
        Contact contact = model.currentContact();
        contact.setfName(view.getfName());
        contact.setlName(view.getlName());
        contact.setOrganisation(view.getOrganisation());
        contact.setPhoneNumber(view.getPhoneNumber());
        contact.setNote(view.getNote());
    }

}
