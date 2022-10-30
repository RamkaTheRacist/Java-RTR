using HW.Core.Logic.Interfaces;
using HW.Core.Phonebook;
using HW.Core.Logic.Show;
using HW.Core.Logic.Remove;
using HW.Core.Logic.Update;
using HW.Core.UI.ConsoleOutput;
namespace HW.Core.Logic.Factory
{
    public class LFacOBO : ILFactory
    {
        int index = 0;
        public void MakeOperation(string path, string choose, PhonebookV1 phonebook, IConsoleOutError error, IConsoleOutput output, IConsoleOutSuc outSuc, IConsoleInput input)
        {
            switch (choose)
            {
                case "1":
                    if (index + 1 < phonebook.SizeOfBook())
                    {
                        index++;
                    }
                    new ShowV1(phonebook, output, error).ShowContact(index);
                    break;
                case "2":
                    if (index - 1 > -1)
                    {
                        index--;
                    }
                    new ShowV1(phonebook, output, error).ShowContact(index);
                    break;
                case "3":
                    new RemoveV1(phonebook, outSuc, error).Remove(index);
                    if (index != 0)
                    {
                        index--;
                    }
                    new ShowV1(phonebook, output, error).ShowContact(index);
                    break;
                case "4":
                    new UpdateV1(phonebook, input, outSuc).Update(index);
                    new ShowV1(phonebook, output, error).ShowContact(index);
                    break;
                case "0":
                    break;
                default:
                    new ConsoleOutErrorV1().CommandError();
                    break;
            }
        }
    }
}