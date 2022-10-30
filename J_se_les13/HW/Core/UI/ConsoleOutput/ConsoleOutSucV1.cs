using HW.Core.Logic.Interfaces;
namespace HW.Core.UI.ConsoleOutput
{
    public class ConsoleOutSucV1 : IConsoleOutSuc
    {
        public void UpdateSuccess()
        {
            System.Console.WriteLine("Entry successfully updated");
        }

        public void SaveSuccess()
        {
            System.Console.WriteLine("Entry successfully saved");
        }

        public void RemoveSuccess()
        {
            System.Console.WriteLine("Entry successfully removed");
        }

        public void AddSuccess()
        {
            System.Console.WriteLine("Entry successfully added");
        }
    }
}