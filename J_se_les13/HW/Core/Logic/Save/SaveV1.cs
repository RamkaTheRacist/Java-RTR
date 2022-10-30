using HW.Core.Phonebook;
using HW.Core.Contact;
namespace HW.Core.Logic.Save
{
    public class SaveV1 : SaveBase
    {
        public SaveV1(PhonebookV1 phonebook)
        : base(phonebook)
        {
        }

        public override void Save(string type, string path)
        {
            using (StreamWriter writer = new StreamWriter(path, false))
            {
                if (type == "txt")
                {
                    for (int i = 0; i < Phonebook.SizeOfBook(); i++)
                    {
                        ContactV1 contact = Phonebook.GetContact(i);
                        string text = $"{contact.GetfName()} {contact.GetlName()} {contact.GetOrganisation()} {contact.GetPhoneNumber()} {contact.GetNote()}";
                        writer.WriteLine(text);
                    }
                }
                else if (type == "csv")
                {
                    for (int i = 0; i < Phonebook.SizeOfBook(); i++)
                    {
                        ContactV1 contact = Phonebook.GetContact(i);
                        string text = $"{contact.GetfName()};{contact.GetlName()};\"{contact.GetOrganisation()}\";{contact.GetPhoneNumber()};\"{contact.GetNote()}\"";
                        writer.WriteLine(text);
                    }
                }
                writer.Flush();
                writer.Close();

            }
        }


    }
}