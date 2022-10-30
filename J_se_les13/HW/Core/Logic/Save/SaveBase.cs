using HW.Core.Phonebook;
namespace HW.Core.Logic.Save
{
    public abstract class SaveBase
    {
        public PhonebookV1 Phonebook { get; set; }
        protected SaveBase(PhonebookV1 phonebook)
        {
            Phonebook = phonebook;
        }
        public abstract void Save(string type, string path);
    }
}