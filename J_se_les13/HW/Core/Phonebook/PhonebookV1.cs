using System;
using HW.Core.Contact;
namespace HW.Core.Phonebook

{
    public class PhonebookV1
    {
        private List<ContactV1> contacts;
        public PhonebookV1()
        {
            contacts = new List<ContactV1>();
        }
        public void Add(ContactV1 contact)
        {
            contacts.Add(contact);
        }

        public void Remove(int index)
        {
            contacts.RemoveAt(index);
        }

        public bool IfExist(ContactV1 contact)
        {
            for (int i = 0; i < SizeOfBook(); i++)
            {
                ContactV1 tmp = GetContact(i);
                if (tmp.Compare(contact) == true)
                {
                    return true;
                }
            }
            return false;

        }

        public int GetContactIndex(ContactV1 contact)
        {
            return contacts.IndexOf(contact);
        }

        public ContactV1 GetContact(int index)
        {
            return contacts[index];
        }

        public int SizeOfBook()
        {
            return contacts.Count();
        }

    }
}
/*public class Phonebook {
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
*/