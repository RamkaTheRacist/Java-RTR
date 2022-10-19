package Java.J_se_les11.HW.Core.Logic.MVP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Java.J_se_les11.HW.Core.Logic.Contact.Contact;
import Java.J_se_les11.HW.Core.Logic.Phonebook.Phonebook;

public class Model {
    private String path;
    private int index;
    Phonebook phonebook;

    public Model(String path) {
        phonebook = new Phonebook();
        index = 0;
        this.path = path;
    }
    public Contact currentContact() {
        return phonebook.getContact(index);
    }

    public void saveAs(int any, String path) {
        try (FileWriter writer = new FileWriter(path, false)) {
            if ((any == 1) || (any == 2))  {
                for (int i = 0; i < phonebook.sizeOfBook(); i++) {
                    Contact contact = phonebook.getContact(i);
                    writer.append(String.format("%s %s %s %d %s\n", contact.getfName(), contact.getlName(),
                            contact.getOrganisation(), contact.getPhoneNumber(), contact.getNote()));
                }
            } else if (any == 3) {
                for (int i = 0; i < phonebook.sizeOfBook(); i++) {
                    Contact contact = phonebook.getContact(i);
                    writer.append(String.format("%s;%s;\"%s\";%d;\"%s\"\n", contact.getfName(), contact.getlName(),
                            contact.getOrganisation(), contact.getPhoneNumber(), contact.getNote()));
                }
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void save(){
        String type = getType(path);
        try (FileWriter writer = new FileWriter(path, false)) {
            if (type.equals("txt") || (type.equals("db"))) {
                for (int i = 0; i < phonebook.sizeOfBook(); i++) {
                    Contact contact = phonebook.getContact(i);
                    writer.append(String.format("%s %s %s %d %s\n", contact.getfName(), contact.getlName(),
                            contact.getOrganisation(), contact.getPhoneNumber(), contact.getNote()));
                }
            } else if (type.equals("csv")) {
                for (int i = 0; i < phonebook.sizeOfBook(); i++) {
                    Contact contact = phonebook.getContact(i);
                    writer.append(String.format("%s;%s;\"%s\";%d;\"%s\"\n", contact.getfName(), contact.getlName(),
                            contact.getOrganisation(), contact.getPhoneNumber(), contact.getNote()));
                }
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
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
                } else if((type.equals("txt")) || (type.equals("db"))){
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
