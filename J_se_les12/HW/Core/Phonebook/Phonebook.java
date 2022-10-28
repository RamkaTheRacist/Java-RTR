package Java.J_se_les12.HW.Core.Phonebook;

import java.util.ArrayList;
import java.util.List;

import Java.J_se_les12.HW.Core.Contact.Contact;

public class Phonebook {
    private List<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public void remove(int index) {
        contacts.remove(index);
    }

    public boolean ifExist(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact tmp = contacts.get(i);
            if (contact.compareTo(tmp) == 0) {
                return true;
            }
        }
        return false;

    }

    public Integer getContactIndex(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact tmp = contacts.get(i);
            if (contact.equals(tmp) == true) {
                return i;
            }
        }
        return null;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public int sizeOfBook() {
        return contacts.size();
    }
}
