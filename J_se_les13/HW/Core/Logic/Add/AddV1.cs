using System;
using HW.Core.Contact;
using HW.Core.Phonebook;
using HW.Core.Logic.Interfaces;
using HW.Core.Logic.Add;
namespace HW.Core.Logic.Add
{
    public class AddV1 : AddBase
    {
        IConsoleOutSuc OutSuc { get; set; }
        IConsoleOutError Error { get; set; }
        public AddV1(PhonebookV1 phonebook, IConsoleInput input, IConsoleOutSuc outSuc, IConsoleOutError error)
            : base(phonebook, input)
        {
            OutSuc = outSuc;
            Error = error;
        }
        public override void Add()
        {
            ContactV1 tmp = new ContactV1(Input.SetfName(), Input.SetlName(), Input.SetOrganisation(),
        Input.SetPhoneNumber(), Input.SetNote());
            if (Phonebook.IfExist(tmp) == true)
            {
                Error.AddError();
            }
            else
            {
                Phonebook.Add(tmp);
                OutSuc.AddSuccess();
            }
        }
    }
}