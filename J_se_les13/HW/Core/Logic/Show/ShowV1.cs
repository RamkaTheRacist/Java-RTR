using HW.Core.Phonebook;
using HW.Core.Logic.Interfaces;
using HW.Core.Contact;
namespace HW.Core.Logic.Show
{
    public class ShowV1 : ShowBase
    {
        IConsoleOutError Error { get; set; }

        public ShowV1(PhonebookV1 phonebook, IConsoleOutput output, IConsoleOutError error)
        : base(phonebook, output)
        {
            Error = error;
        }


        public override void ShowContact(int index)
        {
            if (Phonebook.SizeOfBook() > 0)
            {
                if (index < Phonebook.SizeOfBook())
                {
                    ContactV1 tmp = Phonebook.GetContact(index);
                    Output.ShowEntryPos(index);
                    Output.GetfName(tmp.GetfName());
                    Output.GetlName(tmp.GetlName());
                    Output.GetOrganisation(tmp.GetOrganisation());
                    Output.GetPhoneNumber(tmp.GetPhoneNumber());
                    Output.GetNote(tmp.GetNote());
                }
                else
                {
                    Error.IndexError();
                }
            }
            else
            {
                Error.EmptyError();
            }
        }
        public void ShowAll()
        {
            if (Phonebook.SizeOfBook() > 0)
            {
                for (int i = 0; i < Phonebook.SizeOfBook(); i++)
                {
                    ShowContact(i);
                }
            }
            else
            {
                Error.EmptyError();
            }
        }

    }
}