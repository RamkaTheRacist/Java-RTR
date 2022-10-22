package Java.J_se_les11.HW.Core.Logic.SaveLogic;

import java.io.FileWriter;
import java.io.IOException;

import Java.J_se_les11.HW.Core.Logic.Contact.Contact;
import Java.J_se_les11.HW.Core.Logic.Phonebook.Phonebook;

public class Save implements ISave {
    Phonebook phonebook;

    public Save(Phonebook phonebook) {
        this.phonebook = phonebook;
    }

    @Override
    public void save(String type, String path) {
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
}