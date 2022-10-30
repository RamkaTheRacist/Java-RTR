using HW.Core.Phonebook;
using HW.Core.Logic.Interfaces;
namespace HW.Core.Logic.Remove
{
    public class RemoveV1 : RemoveBase
    {
        public RemoveV1(PhonebookV1 phonebook, IConsoleOutSuc outSuc, IConsoleOutError error)
        : base(phonebook, outSuc, error)
        {
        }
        public override void Remove(int index)
        {
            if (Phonebook.SizeOfBook() > 0)
            {
                Phonebook.Remove(index);
                OutSuc.RemoveSuccess();
            }
        }
    }
}