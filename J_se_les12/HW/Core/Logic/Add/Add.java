package Java.J_se_les12.HW.Core.Logic.Add;

import Java.J_se_les12.HW.Core.Contact.Contact;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleInput;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutErrors;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutSuc;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public class Add extends AddBase {
    IConsoleOutSuc output;
    IConsoleOutErrors error;

    public Add(Phonebook phonebook, IConsoleInput input, IConsoleOutSuc output, IConsoleOutErrors error) {
        super(phonebook, input);
        this.output = output;
        this.error = error;
    }

    @Override
    public void add() {
        Contact tmp = new Contact(input.setfName(), input.setlName(), input.setOrganisation(),
                input.setPhoneNumber(), input.setNote());
        if (this.phonebook.ifExist(tmp) == true) {
            error.addError();
        } else {
            this.phonebook.add(tmp);
            output.addSuccess();
        }
    }
}