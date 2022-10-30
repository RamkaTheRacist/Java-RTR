using System;
namespace HW.Core.Logic.Interfaces
{
    public interface IConsoleInput
    {
        string SetfName();

        string SetlName();

        string SetOrganisation();

        int SetPhoneNumber();

        string SetNote();

        int SearchIndex();

        string ChooseName();

        string GetCommand();
    }
}