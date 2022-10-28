package Java.J_se_les12.HW.Core.UI;

import Java.J_se_les12.HW.Core.Logic.Factory.LMidFactory;
import Java.J_se_les12.HW.Core.Logic.Import.ImportV1;
import Java.J_se_les12.HW.Core.Phonebook.Phonebook;
import Java.J_se_les12.HW.Core.Presenter.PresenterV1;
import Java.J_se_les12.HW.Core.UI.ConsoleInput.ConsoleInputV1;
import Java.J_se_les12.HW.Core.UI.ConsoleOutput.ConsoleOutErrors;
import Java.J_se_les12.HW.Core.UI.ConsoleOutput.ConsoleOutSuc;
import Java.J_se_les12.HW.Core.UI.ConsoleOutput.ConsoleOutput;
import Java.J_se_les12.HW.Core.UI.ConsoleOutput.MainMenu1;

public class App {
    public void app() {
        Phonebook ph = new Phonebook();
        String path = "Java\\J_se_les12\\HW\\Files\\tmp.txt";
        new ImportV1(path, ph).importFiles();
        PresenterV1 pres = new PresenterV1(path, ph, new LMidFactory(), new ConsoleOutErrors(), new ConsoleOutput(),
                new ConsoleOutSuc(), new ConsoleInputV1(), new MainMenu1());
        pres.doThis();
    }
}
