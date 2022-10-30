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
        //File file = new File(FilePath);
    }
}

/*
import Java.J_se_les12.HW.Core.Contact.Contact;
import Java.J_se_les12.HW.Core.Logic.GetType.GetType;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public class ImportV1 extends ImportBase {
    public ImportV1(String path, Phonebook phonebook) {
        super(path, phonebook);
    }

    @Override
    public void importFiles() {
        try {
            File file = new File(getPath());
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String data = reader.readLine();
            String split = "";
            String type = new GetType().getType(getPath());
            if (type.equals("csv")) {
                split = ";";
            } else if (type.equals("txt")) {
                split = " ";
            }
            while (data != null) {
                String[] tmp = data.split(split);
                String fn = tmp[0];
                String ln = tmp[1];
                String or = tmp[2];
                Integer num = Integer.parseInt(tmp[3]);
                String no = tmp[4];
                this.phonebook.add(new Contact(fn, ln, or, num, no));
                data = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}*/