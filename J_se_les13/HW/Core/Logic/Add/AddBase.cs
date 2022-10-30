using System;
using HW.Core.Contact;
using HW.Core.Logic.Interfaces;
using HW.Core.Phonebook;
namespace HW.Core.Logic.Add
{
    public abstract class AddBase
    {
        public PhonebookV1 Phonebook { get; set; }
        public IConsoleInput Input { get; set; }
        protected AddBase(PhonebookV1 phonebook, IConsoleInput input)
        {
            Phonebook = phonebook;
            Input = input;
        }

        public abstract void Add();

    }
}