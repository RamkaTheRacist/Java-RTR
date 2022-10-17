package Java.J_se_les11.HW.Core.Logic.MVP;

import Java.J_se_les11.HW.Core.Logic.Contact.Contact;

public class Presenter {
    private Model model;
    private IView view;

    public Presenter(String path, IView view) {
        this.view = view;
        model = new Model(path);
    }

    public void showAllContAsNumb() {
        if (model.currentBook().sizeOfBook() > 0) {
            view.showAllPos(model.currentBook().sizeOfBook());
        } else {
            view.empty();
        }
        model.setIndex(0);

    }

    public void showAllContacts() {
        if (model.currentBook().sizeOfBook() > 0) {
            model.setIndex(0);
            for (int i = 0; i < model.currentBook().sizeOfBook(); i++) {
                model.setIndex(i);
                var contact = model.currentContact();
                view.setfName(contact.getfName());
                view.setlName(contact.getlName());
                view.setOrganisation(contact.getOrganisation());
                view.setPhoneNumber(contact.getPhoneNumber());
                view.setNote(contact.getNote());
            }

        } else {
            view.empty();
        }
        model.setIndex(0);
    }

    public void showContact() {
        if (model.currentBook().sizeOfBook() > 0) {
            var contact = model.currentContact();
            view.showPosition(model.getIndex() + 1);
            view.setfName(contact.getfName());
            view.setlName(contact.getlName());
            view.setOrganisation(contact.getOrganisation());
            view.setPhoneNumber(contact.getPhoneNumber());
            view.setNote(contact.getNote());
        } else {
            view.empty();
        }
    }

    public void showContactWithIndex() {
        if (model.currentBook().sizeOfBook() > 0) {
            int index = view.searchIndex();
            if ((index >= 0) && (index < model.currentBook().sizeOfBook())) {
                model.setIndex(index);
                var contact = model.currentContact();
                view.setfName(contact.getfName());
                view.setlName(contact.getlName());
                view.setOrganisation(contact.getOrganisation());
                view.setPhoneNumber(contact.getPhoneNumber());
                view.setNote(contact.getNote());

            } else {
                view.errorIndex();
            }
        } else {
            view.empty();
        }
        model.setIndex(0);
    }

    public void add() {
        Contact tmp = new Contact(view.getfName(), view.getlName(), view.getOrganisation(),
                view.getPhoneNumber(), view.getNote());
        if (model.currentBook().ifExist(tmp) == true) {
            view.errorAdd();
        } else {
            model.currentBook().add(tmp);
            view.addSuccess();
        }

    }

    public void remove() {
        if (model.currentBook().sizeOfBook() > 0) {
            Contact contact = model.currentContact();
            model.currentBook().remove(contact);
            view.removeSuccess();
            model.setIndex(model.getIndex());
        } else {
            view.empty();
        }
    }

    public void update() {
        if (model.currentBook().sizeOfBook() > 0) {
            Contact contact = model.currentContact();
            contact.setfName(view.getfName());
            contact.setlName(view.getlName());
            contact.setOrganisation(view.getOrganisation());
            contact.setPhoneNumber(view.getPhoneNumber());
            contact.setNote(view.getNote());
            view.updateSuccess();
        } else {
            view.empty();
        }

    }

    public void save() {
        model.saveAs();
        view.saveSuccess();
    }

    public void saveAs() {
        int tmpType = view.chooseType();
        String tmpName = view.chooseName();
        String fileName = "";
        String path = "Java\\J_se_les11\\HW\\Files\\";
        switch (tmpType) {
            case 1:
                fileName = tmpName + ".txt";
                break;
            case 2:
                fileName = tmpName + ".db";
                break;
            case 3:
                fileName = tmpName + ".csv";
                break;
        }
        model.saveAs(tmpType, path + fileName);
        view.saveSuccess();
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
