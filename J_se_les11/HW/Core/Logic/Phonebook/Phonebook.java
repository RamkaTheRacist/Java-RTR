package Java.J_se_les11.HW.Core.Logic.Phonebook;

import java.util.ArrayList;
import java.util.List;

import Java.J_se_les11.HW.Core.Logic.Contact.Contact;

public class Phonebook {
    private List<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    public void add(Contact contact){
        contacts.add(contact);
    }

    public void remove(Contact contact){
        contacts.remove(contact);
        
    }

    public boolean ifExist(Contact contact){
        for (int i = 0; i < contacts.size(); i++) {
            Contact tmp = contacts.get(i);
            if(contact.compareTo(tmp) == 0){
                return true;
            }
        }
        return false;
        
    }

    public Integer getContactIndex(Contact contact){
        for (int i = 0; i < contacts.size(); i++) {
            Contact tmp = contacts.get(i);
            if(contact.equals(tmp) == true){
                return i;
            }
        }
        return null;
    }
    public Contact getContact(int index){
        return contacts.get(index);
    }
    public int sizeOfBook() {
        return contacts.size();
    }
}
