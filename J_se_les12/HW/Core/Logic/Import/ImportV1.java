package Java.J_se_les12.HW.Core.Logic.Import;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

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

}
