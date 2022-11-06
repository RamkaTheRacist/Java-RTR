package Java.J_se_les9.HWV2.Core.Logic.Add;

import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleIn;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleOut;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleSuc;
import Java.J_se_les9.HWV2.Core.Zoo.Zoo;

public abstract class AddBase {
    Zoo zooList;
    IConsoleIn input;
    IConsoleOut output;
    IConsoleSuc suc;

    protected AddBase(Zoo zooList, IConsoleIn input, IConsoleOut output, IConsoleSuc suc) {
        this.zooList = zooList;
        this.input = input;
        this.output = output;
        this.suc = suc;
    }

    public abstract void addAnimal(int type);
}
