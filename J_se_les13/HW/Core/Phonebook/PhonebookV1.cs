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
