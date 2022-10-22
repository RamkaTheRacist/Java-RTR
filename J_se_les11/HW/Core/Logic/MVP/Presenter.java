package Java.J_se_les11.HW.Core.Logic.MVP;

import Java.J_se_les11.HW.Core.Logic.Contact.Contact;
import Java.J_se_les11.HW.Core.Logic.RemoveLogic.IConsoleR;
import Java.J_se_les11.HW.Core.Logic.RemoveLogic.Remove;
import Java.J_se_les11.HW.Core.Logic.SaveLogic.IConsoleS;
import Java.J_se_les11.HW.Core.Logic.UpdateLogic.IConsoleU;
import Java.J_se_les11.HW.Core.Logic.UpdateLogic.Update;
import Java.J_se_les11.HW.Core.UI.IConsoleUIErr;

public class Presenter {
    private Model model;
    private IView view;
    private IConsoleS iconsoleS;
    private IConsoleUIErr error;
    private Remove remover;
    private IConsoleR iremover;
    private IConsoleU iconsoleU;
    private Update updater;

    public Presenter(String path, IView view, IConsoleS iconsoleS, IConsoleR iremover, IConsoleU iconsoleU,
            IConsoleUIErr error) {
        this.view = view;
        this.iconsoleS = iconsoleS;
        this.iremover = iremover;
        this.error = error;
        this.iconsoleU = iconsoleU;
        model = new Model(path);
        remover = new Remove(model.currentBook(), model);
        updater = new Update(model.currentBook(), model, view);

    }

    public void showAllContAsNumb() {
        if (model.currentBook().sizeOfBook() > 0) {
            view.showAllPos(model.currentBook().sizeOfBook());
        } else {
            error.emptyError();
        }
        model.setIndex(0);

    }

    public void showAllContacts() {
        if (model.currentBook().sizeOfBook() > 0) {
            model.setIndex(0);
            for (int i = 0; i < model.currentBook().sizeOfBook(); i++) {
                model.setIndex(i);
                showContact();
            }
        } else {
            error.emptyError();
        }
        model.setIndex(0);
    }

    public void showContact() {
        if (model.currentBook().sizeOfBook() > 0) {
            Contact contact = model.currentContact();
            view.showPosition(model.getIndex() + 1);
            view.setfName(contact.getfName());
            view.setlName(contact.getlName());
            view.setOrganisation(contact.getOrganisation());
            view.setPhoneNumber(contact.getPhoneNumber());
            view.setNote(contact.getNote());
        } else {
            error.emptyError();
        }
    }

    public void showContactWithIndex() {
        if (model.currentBook().sizeOfBook() > 0) {
            int index = view.searchIndex();
            if ((index >= 0) && (index < model.currentBook().sizeOfBook())) {
                model.setIndex(index);
                showContact();
            } else {
                error.errorIndex();
            }
        } else {
            error.emptyError();
        }
        model.setIndex(0);
    }

    public void add() {
        Contact tmp = new Contact(view.getfName(), view.getlName(), view.getOrganisation(),
                view.getPhoneNumber(), view.getNote());
        if (model.currentBook().ifExist(tmp) == true) {
            error.errorAdd();
        } else {
            model.currentBook().add(tmp);
            view.addSuccess();
        }

    }

    public void remove() {
        if (model.currentBook().sizeOfBook() > 0) {
            remover.remove();
            iremover.removeSuccess();
        } else {
            error.emptyError();
        }
    }

    public void update() {
        if (model.currentBook().sizeOfBook() > 0) {
            updater.update();
            iconsoleU.updateSuccess();
        } else {
            error.emptyError();
        }

    }

    public void save() {
        model.save();
        iconsoleS.saveSuccess();
    }

    public void saveAs() {
        String fileName = view.chooseName();
        String path = "Java\\J_se_les11\\HW\\Files\\";
        model.saveAs(fileName, path + fileName);
        iconsoleS.saveSuccess();
    }

    public void next() {
        if (model.currentBook().sizeOfBook() > 0) {
            if (model.getIndex() + 1 < model.currentBook().sizeOfBook()) {
                model.setIndex(model.getIndex() + 1);
            }
        }
    }

    public void prev() {
        if (model.currentBook().sizeOfBook() > 0) {
            if (model.getIndex() - 1 > -1) {
                model.setIndex(model.getIndex() - 1);
            }
        }
    }

    public void loadFile() {
        model.load();
    }
}
