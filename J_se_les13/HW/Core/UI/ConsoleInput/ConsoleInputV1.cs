using HW.Core.Logic.Interfaces;
namespace HW.Core.UI.ConsoleInput
{
    public class ConsoleInputV1 : IConsoleInput
    {
        public string SetfName()
        {
            System.Console.WriteLine("First name: ");
            return System.Console.ReadLine();
        }
        public string SetlName()
        {
            System.Console.WriteLine("Last name: ");
            return System.Console.ReadLine();
        }

        public string SetOrganisation()
        {
            System.Console.WriteLine("Organisation: ");
            return System.Console.ReadLine();
        }
        public string SetNote()
        {
            System.Console.WriteLine("Note: ");
            return System.Console.ReadLine();
        }
        public int SetPhoneNumber()
        {
            int phoneNumber = 0;
            System.Console.WriteLine("Phone number: ");
            while (true)
            {
                try
                {
                    phoneNumber = int.Parse(System.Console.ReadLine());
                    return phoneNumber;
                }
                catch (System.Exception)
                {

                    System.Console.WriteLine("Invalid phone number");
                }
            }

        }
        public int SearchIndex()
        {
            int phoneNumber = 0;
            System.Console.WriteLine("Entry`s position: ");
            while (true)
            {
                try
                {
                    phoneNumber = int.Parse(System.Console.ReadLine());
                    return phoneNumber;
                }
                catch (System.Exception)
                {
                    System.Console.WriteLine("Invalid index");
                }
            }

        }
        public string ChooseName()
        {
            System.Console.WriteLine("File name and type: ");
            return System.Console.ReadLine();
        }
        public string GetCommand()
        {
            return System.Console.ReadLine();
        }
    }
}