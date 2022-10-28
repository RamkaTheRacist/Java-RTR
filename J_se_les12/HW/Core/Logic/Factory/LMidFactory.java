package Java.J_se_les12.HW.Core.Logic.Factory;

import Java.J_se_les12.HW.Core.Logic.Add.Add;
import Java.J_se_les12.HW.Core.Logic.GetPath.GetPath;
import Java.J_se_les12.HW.Core.Logic.GetType.GetType;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleInput;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutErrors;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutSuc;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutput;
import Java.J_se_les12.HW.Core.Logic.Interfaces.ILFactory;
import Java.J_se_les12.HW.Core.Logic.Save.SaveV1;
import Java.J_se_les12.HW.Core.Logic.Show.ShowV1;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;
import Java.J_se_les12.HW.Core.Presenter.PresenterV1;
import Java.J_se_les12.HW.Core.UI.ConsoleOutput.MainMenu2;

public class LMidFactory implements ILFactory {
    @Override
    public void makeOperation(String path, String choose, Phonebook phonebook, IConsoleOutErrors errors,
            IConsoleOutput output, IConsoleOutSuc outSuc, IConsoleInput input) {
        switch (choose) {
            case "1":
                new ShowV1(phonebook, output, errors).showAll();
                break;
            case "2":
                new ShowV1(phonebook, output, errors).showContact(0);
                new PresenterV1(path, phonebook, new LFacOBO(), errors, output, outSuc, input, new MainMenu2())
                        .doThis();
                ;
                break;
            case "3":
                int index = input.searchIndex();
                new ShowV1(phonebook, output, errors).showContact(index);
                break;
            case "4":
                new Add(phonebook, input, outSuc, errors).add();
                break;
            case "5":
                new SaveV1(phonebook).save(new GetType().getType(path), path);
                outSuc.saveSuccess();
                break;
            case "6":
                String tmp = input.chooseName();
                new SaveV1(phonebook).save(new GetType().getType(tmp), new GetPath().getPath(path) + tmp);
                outSuc.saveSuccess();
                break;
            case "0":
                break;
            default:
                errors.commandError();
                break;
        }

    }

}
