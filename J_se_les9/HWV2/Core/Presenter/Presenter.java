package Java.J_se_les9.HWV2.Core.Presenter;

import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleErr;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleIn;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleOut;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleOutFly;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleSuc;
import Java.J_se_les9.HWV2.Core.Interfaces.IFactory;
import Java.J_se_les9.HWV2.Core.Interfaces.IMenu;
import Java.J_se_les9.HWV2.Core.Interfaces.IgetInfo;
import Java.J_se_les9.HWV2.Core.Interfaces.ImakeSound;
import Java.J_se_les9.HWV2.Core.Zoo.Zoo;

public class Presenter extends PresenterBase {
    Zoo zoo;
    IgetInfo info;
    ImakeSound sound;
    IConsoleErr error;
    IConsoleOut output;
    IConsoleIn input;
    IConsoleSuc suc;
    IMenu menu;
    IConsoleOutFly fly;

    public Presenter(IFactory factory, Zoo zoo, IgetInfo info, ImakeSound sound, IConsoleErr error,
            IConsoleOut output, IConsoleIn input, IConsoleSuc suc, IMenu menu, IConsoleOutFly fly) {
        super(factory);
        this.zoo = zoo;
        this.info = info;
        this.sound = sound;
        this.error = error;
        this.output = output;
        this.input = input;
        this.suc = suc;
        this.menu = menu;
        this.fly = fly;
    }

    @Override
    public void doThis() {
        String choose = "";
        while (!choose.equals("0")) {
            menu.showMenu();
            choose = input.setStringData();
            factory.makeOperation(choose, zoo, info, sound, error, output, input, suc, fly);
        }
    }
}
