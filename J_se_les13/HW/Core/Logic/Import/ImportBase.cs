using HW.Core.Phonebook;
namespace HW.Core.Logic.Import
{
    public abstract class ImportBase
    {
        PhonebookV1 Phonebook { get; set; }
        public PhonebookV1 phonebook
        {
            get { return Phonebook; }
        }
        private string FilePath { get; set; }
        public string filePath
        {
            get { return FilePath; }
        }
        protected ImportBase(PhonebookV1 phonebook, string filePath)
        {
            Phonebook = phonebook;
            FilePath = filePath;

        }
        public abstract void ImportFiles();
    }
}