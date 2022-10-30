using HW.Core.Logic.Interfaces;
namespace HW.Core.UI.ConsoleOutput
{
    public class ConsoleOutErrorV1 : IConsoleOutError
    {
        public void IndexError()
        {
            System.Console.WriteLine("Entry with such index doesnt exist");
        }
        public void EmptyError()
        {
            System.Console.WriteLine("Phonebook is empty");
        }
        public void CommandError()
        {
            System.Console.WriteLine("Invalid command");
        }
        public void AddError()
        {
            System.Console.WriteLine("Such entry is exist already");
        }
    }
}