package Java.J_se_les12.HW.Core.Presenter;

import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleInput;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutErrors;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutSuc;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IConsoleOutput;
import Java.J_se_les12.HW.Core.Logic.Interfaces.ILFactory;
import Java.J_se_les12.HW.Core.Logic.Interfaces.IMainMenu;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;

public class PresenterV1 extends PresenterBase {
    private String path;
    Phonebook phonebook;
    IConsoleOutErrors errors;
    IConsoleOutput output;
    IConsoleOutSuc outSuc;
    IConsoleInput consoleInput;
    IMainMenu menu;

    public PresenterV1(String path, Phonebook phonebook, ILFactory factory, IConsoleOutErrors errors,
            IConsoleOutput output, IConsoleOutSuc outSuc, IConsoleInput consoleInput, IMainMenu menu) {
        super(factory);
        this.path = path;
        this.phonebook = phonebook;
        this.errors = errors;
        this.output = output;
        this.outSuc = outSuc;
        this.consoleInput = consoleInput;
        this.menu = menu;
    }

    @Override
    public void doThis() {
        String choose = "";
        while (!choose.equals("0")) {
            menu.showMainMenu();
            choose = consoleInput.getCommand();
            factory.makeOperation(path, choose, phonebook, errors, output, outSuc, consoleInput);
        }

    }

}
