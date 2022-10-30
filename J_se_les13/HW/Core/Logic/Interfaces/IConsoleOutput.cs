namespace HW.Core.Logic.Interfaces
{
    public interface IConsoleOutput
    {
        void GetfName(string value);

        void GetlName(string value);

        void GetOrganisation(string value);

        void GetPhoneNumber(int value);

        void GetNote(string value);

        void ShowEntryPos(int value);
    }
}