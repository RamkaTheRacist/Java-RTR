using HW.Core.Logic.Interfaces;
namespace HW.Core.UI.ConsoleOutput
{
    public class Mainmenu2 : IMainMenu
    {
        public void ShowMenu()
        {
            System.Console.WriteLine("(1)Next contact\n(2)Prev contact\n(3)Remove this contact\n(4)Update this contact\n(0)Back\n");
        }
    }
}