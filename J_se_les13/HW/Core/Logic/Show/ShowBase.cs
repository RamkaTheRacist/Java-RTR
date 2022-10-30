using HW.Core.Phonebook;
using HW.Core.Logic.Interfaces;
namespace HW.Core.Logic.Show
{
    public abstract class ShowBase
    {
        public PhonebookV1 Phonebook { get; set; }

        public IConsoleOutput Output { get; set; }
        protected ShowBase(PhonebookV1 phonebook, IConsoleOutput output)
        {
            Phonebook = phonebook;
            Output = output;
        }
        public abstract void ShowContact(int index);
    }
}