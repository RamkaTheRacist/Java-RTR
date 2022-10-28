package Java.J_se_les12.HW.Core.Logic.Save;

import java.io.FileWriter;
import java.io.IOException;

import Java.J_se_les12.HW.Core.Contact.Contact;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public class SaveV1 extends SaveBase {

    public SaveV1(Phonebook phonebook) {
        super(phonebook);
    }

    @Override
    public void save(String type, String path) {
        try (FileWriter writer = new FileWriter(path, false)) {
            if (type.equals("txt")) {
                for (int i = 0; i < this.phonebook.sizeOfBook(); i++) {
                    Contact contact = this.phonebook.getContact(i);
                    writer.append(String.format("%s %s %s %d %s\n", contact.getfName(), contact.getlName(),
                            contact.getOrganisation(), contact.getPhoneNumber(), contact.getNote()));
                }
            } else if (type.equals("csv")) {
                for (int i = 0; i < this.phonebook.sizeOfBook(); i++) {
                    Contact contact = this.phonebook.getContact(i);
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
