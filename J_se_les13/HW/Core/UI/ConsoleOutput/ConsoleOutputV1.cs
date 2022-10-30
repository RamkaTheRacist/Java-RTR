using HW.Core.Logic.Interfaces;
namespace HW.Core.UI.ConsoleOutput
{
    public class ConsoleOutputV1 : IConsoleOutput
    {
        public void GetfName(string value)
        {
            System.Console.WriteLine($"First name: {value}");
        }

        public void GetlName(string value)
        {
            System.Console.WriteLine($"Last name: {value}");

        }

        public void GetOrganisation(string value)
        {
            System.Console.WriteLine($"Organisation: {value}");
        }

        public void GetPhoneNumber(int value)
        {
            System.Console.WriteLine($"Phone number: {value}");
        }

        public void GetNote(string value)
        {
            System.Console.WriteLine($"Note: {value}\n");
        }

        public void ShowEntryPos(int value)
        {
            System.Console.WriteLine($"Position: {value + 1}");
        }
    }
}