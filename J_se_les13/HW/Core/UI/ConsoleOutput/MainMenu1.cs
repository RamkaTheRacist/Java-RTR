using HW.Core.Logic.Interfaces;
namespace HW.Core.UI.ConsoleOutput
{
    public class MainMenu1 : IMainMenu
    {
        public void ShowMenu()
        {
            System.Console.WriteLine("(1)Show all contacts\n(2)Show contact one by one\n(3)Show contact by index\n(4)Add contact\n(5)Save file\n(6)Save as\n(0)Leave\n");
        }
    }
}