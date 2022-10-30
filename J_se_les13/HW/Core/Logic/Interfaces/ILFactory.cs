using HW.Core.Phonebook;
namespace HW.Core.Logic.Interfaces
{
    public interface ILFactory
    {
        void MakeOperation(string path, string choose, PhonebookV1 phonebook, IConsoleOutError error, IConsoleOutput output, IConsoleOutSuc outSuc, IConsoleInput input);
    }
}