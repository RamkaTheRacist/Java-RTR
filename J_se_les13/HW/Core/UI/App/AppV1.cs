using HW.Core.Phonebook;
using HW.Core.Logic.Import;
using HW.Core.Presenter;
using HW.Core.Logic.Factory;
using HW.Core.UI.ConsoleInput;
using HW.Core.UI.ConsoleOutput;



namespace HW.Core.UI.App
{
    public class AppV1
    {
        public void StartApp()
        {
            PhonebookV1 ph = new PhonebookV1();
            string filePath = "C:\\Users\\where\\Desktop\\Git\\Java\\J_se_les13\\HW\\Files\\tmp.txt";
            new ImportV1(ph, filePath).ImportFiles();
            PresenterV1 pres = new PresenterV1(filePath, ph, new LMidFactory(), new ConsoleOutErrorV1(), new ConsoleOutputV1(), new ConsoleOutSucV1(), new ConsoleInputV1(), new MainMenu1());
            pres.DoThis();
        }
    }
}
