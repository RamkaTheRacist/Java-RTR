using System;
using HW.Core.Contact;
using HW.Core.Phonebook;
using HW.Core.Logic.Interfaces;
using HW.Core.Logic.Import;
using HW.Core.Logic.GetType;
namespace HW.Core.Logic.Import
{
    public class ImportV1 : ImportBase
    {
        public ImportV1(PhonebookV1 phonebook, string filePath)
        : base(phonebook, filePath)
        {

        }

        public override void ImportFiles()
        {
            using (StreamReader reader = new StreamReader(filePath))
            {
                string type = new GetTypeV1().GetType(filePath);
                string split = "";
                if (type == "csv")
                {
                    split = ";";
                }
                else if (type == "txt")
                {
                    split = " ";
                }
                string result = reader.ReadLine();
                while (result != null)
                {
                    string[] tmp = result.Split(split);
                    string fn = tmp[0];
                    string ln = tmp[1];
                    string or = tmp[2];
                    int num = int.Parse(tmp[3]);
                    string no = tmp[4];
                    phonebook.Add(new ContactV1(fn, ln, or, num, no));
                    result = reader.ReadLine();
                }
                reader.Close();

            }
        }
    }
}
