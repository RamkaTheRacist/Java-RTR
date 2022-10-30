using HW.Core.Phonebook;
using HW.Core.Logic.Interfaces;
namespace HW.Core.Logic.Update
{
    public abstract class UpdateBase
    {
        public PhonebookV1 Phonebook { get; set; }

        public IConsoleInput Input { get; set; }
        protected UpdateBase(PhonebookV1 phonebook, IConsoleInput input)
        {
            Phonebook = phonebook;
            Input = input;
        }
        public abstract void Update(int index);
    }
}