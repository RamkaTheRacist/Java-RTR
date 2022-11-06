package Java.J_se_les9.HWV2.Core.Logic.Remove;

import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleErr;
import Java.J_se_les9.HWV2.Core.Interfaces.IConsoleSuc;
import Java.J_se_les9.HWV2.Core.Zoo.Zoo;

public abstract class RemoveBase {
    Zoo zooList;
    IConsoleSuc suc;
    IConsoleErr error;

    protected RemoveBase(Zoo zooList, IConsoleSuc suc, IConsoleErr error) {
        this.zooList = zooList;
        this.suc = suc;
        this.error = error;
    }

    public abstract void remove(int index);
}