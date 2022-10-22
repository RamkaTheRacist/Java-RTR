package Java.J_se_les11.HW.Core.Logic.MVP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import Java.J_se_les11.HW.Core.Logic.Contact.Contact;
import Java.J_se_les11.HW.Core.Logic.SaveLogic.Save;
import Java.J_se_les11.HW.Core.Logic.Phonebook.Phonebook;

public class Model {
    private String path;
    private int index;
    Phonebook phonebook;
    Save save;

    public Model(String path) {
        phonebook = new Phonebook();
        save = new Save(phonebook);
        index = 0;
        this.path = path;
    }

    public Contact currentContact() {
        return phonebook.getContact(index);
    }

    public void saveAs(String fileName, String path) {
        String type = getType(fileName);
        save.save(type, path);
    }

    public void save() {
        save.save(getType(path), path);
    }

    private String getType(String path) {
        int tmp = path.indexOf('.');
        return path.substring(tmp + 1);
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String data = reader.readLine();
            String type = getType(path);
            while (data != null) {
                if (type.equals("csv")) {
                    String[] tmp = data.split(";");
                    String fn = tmp[0];
                    String ln = tmp[1];
                    String or = tmp[2];
                    Integer num = Integer.parseInt(tmp[3]);
                    String no = tmp[4];
                    this.phonebook.add(new Contact(fn, ln, or, num, no));
                } else if ((type.equals("txt")) || (type.equals("db"))) {
                    String[] tmp = data.split(" ");
                    String fn = tmp[0];
                    String ln = tmp[1];
                    String or = tmp[2];
                    Integer num = Integer.parseInt(tmp[3]);
                    String no = tmp[4];
                    this.phonebook.add(new Contact(fn, ln, or, num, no));
                }
                data = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Phonebook currentBook() {
        return this.phonebook;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int value) {
        this.index = value;
    }
}
