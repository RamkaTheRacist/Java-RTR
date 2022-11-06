package Java.J_se_les9.HWV2.Core.UI.App;

import Java.J_se_les9.HWV2.Core.Logic.Factory.MainFactory;
import Java.J_se_les9.HWV2.Core.Logic.GetInfo.GetInfo;
import Java.J_se_les9.HWV2.Core.Logic.MakingSounds.MakeSounds;
import Java.J_se_les9.HWV2.Core.Presenter.Presenter;
import Java.J_se_les9.HWV2.Core.UI.ConsoleIn.ConsoleIn;
import Java.J_se_les9.HWV2.Core.UI.ConsoleOut.ConsoleErr;
import Java.J_se_les9.HWV2.Core.UI.ConsoleOut.ConsoleOutFly;
import Java.J_se_les9.HWV2.Core.UI.ConsoleOut.ConsoleSuc;
import Java.J_se_les9.HWV2.Core.UI.ConsoleOut.MenuMain;
import Java.J_se_les9.HWV2.Core.UI.ConsoleOut.Output;
import Java.J_se_les9.HWV2.Core.Zoo.Zoo;

public class App {
    public void startApp() {
        Zoo zoo = new Zoo();
        Presenter pres = new Presenter(new MainFactory(), zoo, new GetInfo(), new MakeSounds(), new ConsoleErr(),
                new Output(), new ConsoleIn(), new ConsoleSuc(), new MenuMain(), new ConsoleOutFly());
        pres.doThis();
    }
}
