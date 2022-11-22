using HW.Core.Phonebook;
using HW.Core.Logic.Interfaces;
namespace HW.Core.Presenter
{
    public class PresenterV1 : PresenterBase
    {
        private string Path { get; set; }
        PhonebookV1 Phonebook { get; set; }
        IConsoleOutError Error { get; set; }
        IConsoleOutput Output { get; set; }
        IConsoleOutSuc OutSuc { get; set; }
        IConsoleInput Input { get; set; }
        IMainMenu Menu { get; set; }
        public PresenterV1(string path, PhonebookV1 phonebook, ILFactory factory, IConsoleOutError error,
            IConsoleOutput output, IConsoleOutSuc outSuc, IConsoleInput input, IMainMenu menu)
        : base(factory)
        {
            Path = path;
            Phonebook = phonebook;
            Factory = factory;
            Error = error;
            Output = output;
            OutSuc = outSuc;
            Input = input;
            Menu = menu;
        }
        public override void DoThis()
        {
            string choose = "";
            while (choose != "0")
            {
                Menu.ShowMenu();
                choose = Input.GetCommand();
                Factory.MakeOperation(Path,choose, Phonebook, Error, Output, OutSuc, Input);
            }
        }

    }
}
