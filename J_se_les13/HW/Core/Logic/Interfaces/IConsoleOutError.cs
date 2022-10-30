namespace HW.Core.Logic.Interfaces
{
    public interface IConsoleOutError
    {
        public void IndexError();

        public void EmptyError();

        public void CommandError();

        public void AddError();
    }
}