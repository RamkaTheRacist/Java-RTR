using HW.Core.Phonebook;
using HW.Core.Logic.Interfaces;

namespace HW.Core.Logic.Remove
{
    public abstract class RemoveBase
    {

        public PhonebookV1 Phonebook { get; set; }

        public IConsoleOutSuc OutSuc { get; set; }
        public IConsoleOutError Error { get; set; }
        protected RemoveBase(PhonebookV1 phonebook, IConsoleOutSuc outSuc, IConsoleOutError error)
        {
            Phonebook = phonebook;
            OutSuc = outSuc;
            Error = error;
        }
        public abstract void Remove(int index);
    }
}