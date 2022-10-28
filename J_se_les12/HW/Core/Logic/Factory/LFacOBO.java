package Java.J_se_les12.HW.Core.Logic.Factory;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleInput;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutErrors;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutSuc;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutput;
import Java.J_se_les12.HW.Core.Logic.Interfaces.ILFactory;
import Java.J_se_les12.HW.Core.Logic.Remove.RemoveV1;
import Java.J_se_les12.HW.Core.Logic.Show.ShowV1;
import Java.J_se_les12.HW.Core.Logic.Update.UpdateV1;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;
import Java.J_se_les12.HW.Core.UI.ConsoleOutput.ConsoleOutErrors;

public class LFacOBO implements ILFactory {
    int index = 0;

    @Override
    public void makeOperation(String path, String choose, Phonebook phonebook, IConsoleOutErrors errors,
            IConsoleOutput output, IConsoleOutSuc outSuc, IConsoleInput input) {
        switch (choose) {
            case "1":
                if (index + 1 < phonebook.sizeOfBook()) {
                    index++;
                }
                new ShowV1(phonebook, output, errors).showContact(this.index);
                break;
            case "2":
                if (index - 1 > -1) {
                    index--;
                }
                new ShowV1(phonebook, output, errors).showContact(this.index);
                break;
            case "3":
                new RemoveV1(phonebook, outSuc, errors).remove(index);
                if (index != 0) {
                    index--;
                }
                new ShowV1(phonebook, output, errors).showContact(index);
                break;
            case "4":

                new UpdateV1(phonebook, input, outSuc).update(this.index);
                new ShowV1(phonebook, output, errors).showContact(this.index);
                break;
            case "0":
                break;
            default:
                new ConsoleOutErrors().commandError();
                break;
        }

    }

}
