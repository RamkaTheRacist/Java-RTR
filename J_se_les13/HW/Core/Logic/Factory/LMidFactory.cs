using HW.Core.Logic.Interfaces;
using HW.Core.Logic.Show;
using HW.Core.Presenter;
using HW.Core.UI.ConsoleOutput;
using HW.Core.Logic.Add;
using HW.Core.Logic.Save;
using HW.Core.Logic.GetPath;
using HW.Core.Logic.GetType;
using HW.Core.Phonebook;


namespace HW.Core.Logic.Factory
{
    public class LMidFactory : ILFactory
    {
        public void MakeOperation(string path, string choose, PhonebookV1 phonebook, IConsoleOutError error, IConsoleOutput output, IConsoleOutSuc outSuc, IConsoleInput input)
        {
            switch (choose)
            {
                case "1":
                    new ShowV1(phonebook, output, error).ShowAll();
                    break;
                case "2":
                    new ShowV1(phonebook, output, error).ShowContact(0);
                    new PresenterV1(path, phonebook, new LFacOBO(), error, output, outSuc, input, new Mainmenu2()).DoThis();
                    break;
                case "3":
                    int index = input.SearchIndex();
                    new ShowV1(phonebook, output, error).ShowContact(index);
                    break;
                case "4":
                    new AddV1(phonebook, input, outSuc, error).Add();
                    break;
                case "5":
                    new SaveV1(phonebook).Save(new GetTypeV1().GetType(path), path);
                    outSuc.SaveSuccess();
                    break;
                case "6":
                    string tmp = input.ChooseName();
                    new SaveV1(phonebook).Save(new GetTypeV1().GetType(tmp), new GetPathV1().GetPath(path) + tmp);
                    outSuc.SaveSuccess();
                    break;
                case "0":
                    break;
                default:
                    error.CommandError();
                    break;
            }
        }
    }
}