using HW.Core.Phonebook;
using HW.Core.Logic.Interfaces;
using HW.Core.Contact;
namespace HW.Core.Logic.Update
{
    public class UpdateV1 : UpdateBase
    {
        IConsoleOutSuc OutSuc { get; set; }
        public UpdateV1(PhonebookV1 phonebook, IConsoleInput input, IConsoleOutSuc outSuc)
        : base(phonebook, input)
        {
            OutSuc = outSuc;
        }
        public override void Update(int index)
        {
            if (Phonebook.SizeOfBook() > 0)
            {
                ContactV1 tmp = Phonebook.GetContact(index);
                tmp.SetfName(Input.SetfName());
                tmp.SetlName(Input.SetlName());
                tmp.SetOrganisation(Input.SetOrganisation());
                tmp.SetPhoneNumber(Input.SetPhoneNumber());
                tmp.SetNote(Input.SetNote());
                OutSuc.UpdateSuccess();
            }
        }
    }
}